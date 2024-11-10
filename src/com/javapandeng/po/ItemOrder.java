package com.javapandeng.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单
 */
public class ItemOrder implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品id
     */
    private Integer itemId;

    /**
     * 购买者id
     */
    private Integer userId;

    private User user;

    /**
     * 订单号
     */
    private String code;

    /**
     * 购买时间
     */
    private Date addTime;

    /**
     * 购买数量
     */
    private String total;

    private Integer isDelete;
    /**
     * 发货时间
     */
    private String outTime;
    /**
     * 发货物流
     */
    private String oMessage;
    /**
     * 退货时间
     */
    private String backTime;
    /**
     * 退货物流
     */
    private String bMessage;
    private String uaddress;

    /**
     * 0.新建待发货1.已取消 2已发货3.到收货4已评价
     */
    private Integer status;

    private List<OrderDetail> details;

    public ItemOrder(Integer id, Integer itemId, Integer userId, User user, String code, Date addTime, String total, Integer isDelete, String outTime, String oMessage, String backTime, String bMessage, String uaddress, Integer status, List<OrderDetail> details) {
        this.id = id;
        this.itemId = itemId;
        this.userId = userId;
        this.user = user;
        this.code = code;
        this.addTime = addTime;
        this.total = total;
        this.isDelete = isDelete;
        this.outTime = outTime;
        this.oMessage = oMessage;
        this.backTime = backTime;
        this.bMessage = bMessage;
        this.uaddress = uaddress;
        this.status = status;
        this.details = details;
    }

    public ItemOrder() {
    }



    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String getoMessage() {
        return oMessage;
    }

    public void setoMessage(String oMessage) {
        this.oMessage = oMessage;
    }

    public String getBackTime() {
        return backTime;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }

    public String getbMessage() {
        return bMessage;
    }

    public void setbMessage(String bMessage) {
        this.bMessage = bMessage;
    }

    @Override
    public String toString() {
        return "ItemOrder{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", userId=" + userId +
                ", user=" + user +
                ", code='" + code + '\'' +
                ", addTime=" + addTime +
                ", total='" + total + '\'' +
                ", isDelete=" + isDelete +
                ", status=" + status +
                '}';
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }
}
