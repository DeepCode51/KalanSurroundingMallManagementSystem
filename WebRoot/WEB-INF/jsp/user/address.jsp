<%@page language="java" contentType="text/html; character=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/user/css/style.css">
    <link rel="stylesheet" href="${ctx}/resource/css/mi.css">
    <link rel="stylesheet" href="${ctx}/resource/css/iconfont/iconfont.css">
    <link rel="stylesheet" href="${ctx}/resource/css/admin.css">
    <script src="${ctx}/resource/user/js/jquery-1.8.3.min.js"></script>
    <script src="${ctx}/resource/user/js/jquery.luara.0.0.1.min.js"></script>
</head>
<body>
<%@include file="/common/utop.jsp"%>
<!--导航条-->


<div class="width1200 center_yh hidden_yh font14" style="height: 40px;line-height: 40px;">
    <span>当前位置：</span><a href="${ctx}/login/uIndex" class="c_66">首页</a>
    ><a href="#" class="c_66">个人中心</a>
    ><a href="#" class="c_66">地址管理</a>
</div>
<div class="width100 hidden_yh" style="background: #f0f0f0;padding-top: 34px;padding-bottom: 34px;">
    <div class="width1200 hidden_yh center_yh">
        <div id="vipNav">
            <a href="${ctx}/user/view" >个人信息</a>
            <a href="${ctx}/user/address" class="on">个人地址</a>
            <a href="${ctx}/itemOrder/my">我的订单</a>
            <a href="${ctx}/sc/findBySql">商品收藏</a>
            <a href="${ctx}/login/pass">修改密码</a>
        </div>
        <div id="vipRight">
            <div class="hidden_yh bj_fff" style="width: 938px;border: 1px solid #ddd;">
                <div class="width100  "  style="height: 60px;line-height: 60px;text-indent: 50px;background: #f5f8fa;border-bottom: 1px solid #ddd;font-size: 24px">
                    我的地址
                    <a  style="font-size: 20px;color: #00a0e9" href="${ctx}/user/newaddress1">添加地址</a>
                </div>
                <div class="hidden_yh" style="padding: 20px;width: 898px;">
                    <c:forEach items="${pagers.datas}" var="data" varStatus="l">
                            <div class="width100 hidden_yh" style="border-bottom: 1px dashed #ddd;padding-top: 10px;padding-bottom: 10px;">

                                <div class="left_yh" style="width: 580px;">
                                    <h3 class="font18 c_33 font100">${data.maddress}</h3>
                                </div>
                                <div class="right_yh">
                                    <a href="${ctx}/user/addressdelete?id=${data.id}" class="onfff block_yh tcenter font16" style="margin-top: 10px;padding: 6px;">删除地址</a>
                                </div>
                            </div>

                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $(".sub").click(function () {
            alert("修改成功");
            $("#myf").submit();
        });
    });
</script>



<%@include file="/common/ufooter.jsp"%>
</body>
</html>



















