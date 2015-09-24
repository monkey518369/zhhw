<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="initial-scale=1.0, user-scalable=no" />
		<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=tjrBmampSfkzl4OVU6b6YGQh"></script>
		<%@ include file="/include/jquery.libs.jsp"%>
		<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/history/lushu.js"></script>
		<style type="text/css">
body,html,#allmap {
	width: 100%;
	height: 100%;
	overflow: hidden;
	margin: 0;
}
</style>
</head>
<body class="easyui-layout" style="width: 100%; height: 100%;">
	<div data-options="region:'west',split:true" title="监控车辆"
		style="width: 250px;">
		<div class="easyui-panel" style="padding: 5px;" border="false">
			 	<input id="carid" type="text"/>
				开始时间 <input id="starttime" class="easyui-datetimebox"
				value="new Date().toLocaleDateString()" style="width: 170px">
			结束时间 <input id="endtime" class="easyui-datetimebox" value="now()"
				style="width: 170px"> <input id="ss"
				class="easyui-numberspinner" value="4000"
				data-options="min:10,max:5000,required:true" style="width: 80px;"></input>
			<a href="#" class="easyui-linkbutton"
				data-options="iconCls:'icon-show'" onclick="setSpeed()">设置速度(m/s)</a>
			<a href="#" class="easyui-linkbutton"
				data-options="iconCls:'icon-line'" onclick="listLine()">生成历史轨迹</a>
			<div>
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-start'" onclick="runLine()">运行</a> <a
					href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-stop'" onclick="stopLine()">停止</a> <a
					href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-pause'" onclick="pauseLine()">暂停</a>
			</div>
			<div>
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-hide'" onclick="hideMessage()">隐藏姓名</a>
				<a href="#" class="easyui-linkbutton"
					data-options="iconCls:'icon-show'" onclick="showMessage()">显示姓名</a>
			</div>
		</div>
	</div>
	<div id="allmap"
		data-options="region:'center',title:'轨迹回放',iconCls:'icon-ok'"></div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/js/history/history.js"></script>
</body>
</html>
