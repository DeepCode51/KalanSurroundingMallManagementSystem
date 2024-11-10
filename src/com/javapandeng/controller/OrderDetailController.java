package com.javapandeng.controller;

import com.javapandeng.po.OrderDetail;
import com.javapandeng.service.ItemOrderService;
import com.javapandeng.service.OrderDetailService;
import com.javapandeng.utils.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 订单详情c层
 */
@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private ItemOrderService itemOrderService;

    @RequestMapping("/ulist")
    public String ulist(OrderDetail orderDetail, Model model, HttpServletRequest request){
        //分页查询
        //String sta = request.getParameter("sstatus");
        //System.out.println(sta);
        String sql = "select * from order_detail  where order_id="+orderDetail.getOrderId();
        Pager<OrderDetail> pagers = orderDetailService.findBySqlRerturnEntity(sql);
        model.addAttribute("pagers",pagers);
        model.addAttribute("obj",orderDetail);
        //Integer sta = itemOrder.getStatus();
       // model.addAttribute("sta",sta);

        return "orderDetail/ulist";
    }
}
