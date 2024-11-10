<%@page language="java" contentType="text/html; character=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<!-- 顶部广告 end -->

<!-- 黑色导航 start -->
<div class="black-nav">
    <div class="wrap">
        <ul class="black-nav-left">
            <li><a href="#">欢迎来到喀兰周边商城！</a><span>|</span></li>
            <li><a href="#">SelectLocation</a><span>|</span></li>
        </ul>
        <ul class="black-nav-right">
            <c:if test="${userId!=null}">
                <a href="#">欢迎您：${username}</a><span>|</span>
                <b></b>
                <li><a href="${ctx}/login/uTui">退出</a><span>|</span></li>
                <b></b>
                <li><a href="${ctx}/car/findBySql">我的购物车</a><span>|</span></li>
                <b></b>
            </c:if>
            <c:if test="${userId==null}">
                <li><a href="${ctx}/login/uLogin">登录</a><span>|</span></li>
                <b></b>
                <li><a href="${ctx}/login/res">注册</a><span>|</span></li>
                <b></b>
            </c:if>
            <a href="${ctx}/user/view">个人中心</a><span>|</span></li>
        </ul>
    </div>
</div>


<!-- 白色导航 start -->
<div class="white-nav">
    <div class="wrap">
        <div class="logo">
            <img src="${ctx}/resource/images/logo2.png" alt="" style="height: 70px;float:left;">
        </div>
        <div class="nav-bar">
            <ul>

                <li style="font-size:25px!important;"><a href="#">喀兰，为你提供一切想要的服务</a></li>

            </ul>
        </div>
        <div class="search2">
            <form action="${ctx}/item/shoplist" method="post">
                <input type="text" placeholder="输入关键词" name="condition" value="${condition}">
                <button class="iconfont">&#xe63d;</button>
            </form>
        </div>
    </div>
</div>