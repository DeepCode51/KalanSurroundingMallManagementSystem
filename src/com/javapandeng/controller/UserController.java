package com.javapandeng.controller;

import com.javapandeng.base.BaseController;
import com.javapandeng.po.Address;
import com.javapandeng.po.User;
import com.javapandeng.service.AddressService;
import com.javapandeng.service.UserService;
import com.javapandeng.utils.Consts;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户c层
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/findBySql")
    public String findBySql(Model model,User user){
        String sql = "select * from user where 1=1 ";
        if(!isEmpty(user.getUserName())){
            sql += " and userName like '%"+user.getUserName()+"%' ";
        }
        sql+=" order by id";
        Pager<User> pagers = userService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",user);
        return "user/user";
    }

    /**
     * 查看用户信息
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("/view")
    public String view(Model model, HttpServletRequest request){
        Object attribute = request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        Integer userId = Integer.valueOf(attribute.toString());
        User obj = userService.load(userId);
        model.addAttribute("obj",obj);
        return "user/view";
    }

    /**
     * 执行修改用户信息的操作
     */
    @RequestMapping("/exUpdate")
    public String exUpdate(User user,HttpServletRequest request){
        Object attribute = request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        user.setId(Integer.valueOf(attribute.toString()));
        userService.updateById(user);
        return "redirect:/user/view.action";
    }

    /**
     * 查看用户地址信息
     */
    @RequestMapping("/address")
    public String address(Model model, HttpServletRequest request){
        Object attribute = request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        Integer userId = Integer.valueOf(attribute.toString());
        String sql = "select * from address where userid="+userId;
        Pager<Address> pagers = addressService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        return "user/address";
    }

    /**
     * 添加用户地址信息
     */
    @RequestMapping("/newaddress1")
    public String newaddress1(Model model, HttpServletRequest request, Address address){
        return "user/newaddress";
    }

    @RequestMapping("/newaddress")
    public String newaddress(Model model, HttpServletRequest request, Address address){
        Object attribute = request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        Integer userId = Integer.valueOf(attribute.toString());
        address.setUserId(userId);
        addressService.insert(address);
        return "user/address";
    }

    /**
     * 添加用户地址信息
     */

    @RequestMapping("/addressdelete")
    public String addressdelete(Integer id, HttpServletRequest request){
        Object attribute = request.getSession().getAttribute(Consts.USERID);
        if(attribute==null){
            return "redirect:/login/uLogin";
        }
        addressService.deleteById(id);
        return "redirect:/user/address.action";
    }

}
