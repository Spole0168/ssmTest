<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>Index</title>
		<script type="text/javascript" charset="UTF-8">
		</script>
	</head>
<body>
	<a href="<%=basePath%>stu/listStudent.do">进入用户管理页</a><br>
	<a href="<%=basePath%>stu/showStu.do">进入Student</a><br>
	
	<table id="gridTable">
	</table>
	<div id="gridPager"></div>
	
	
</body>
</html>