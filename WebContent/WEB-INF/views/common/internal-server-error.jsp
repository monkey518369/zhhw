<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/include/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<%@ include file="/include/jquery.libs.jsp"%>
<script language="javascript">
	$(function(){
    $('.error500').css({'position':'absolute','left':($(window).width()-490)/2});
	$(window).resize(function(){  
    $('.error500').css({'position':'absolute','left':($(window).width()-490)/2});
    });
});  
</script> 
</head>
<body style="background:#edf6fa;">

	<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">500错误提示</a></li>
    </ul>
    </div>
    
    <div class="error500">
    
    <h2>非常遗憾，服务器内部错误！</h2>
    <p>看到这个提示，咨询管理员吧!</p>
    <div class="reindex"><a href="${ctx}" target="_parent">返回首页</a></div>
    
    </div>


</body>
</html>