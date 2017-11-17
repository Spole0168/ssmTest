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
	<form action="">
		<table >
			<tr>
				<td>用户名：</td>  <td><input type="text" id="" name="" value="" >  </td>
			</tr>
			<tr>
				<td>密码：   </td>   <td><input type="password" id="" name="" value="" >  </td>
			</tr>
		
		</table>	
		<input type="button" name="登录" >
		<input type="button" name="忘记密码" >
		<input type="button" name="注册" >
	</form>
	
</body>
</html>