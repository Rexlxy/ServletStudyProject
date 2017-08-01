<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<%
	String error = (String) request.getAttribute("error1");
%>
<body >
<form action="login" method="post">
	<table bgcolor="CCCCFF" align="center" >
			<tr>
				<th colspan="2">用户登录</th>
			</tr>
			<tr>
			<td>User Name:</td>
			<td><input type="text" id="userName" name="userName" value="${userName }"/></td>
			</tr>
						<tr>
			<td>Password:</td>
			<td><input type="password" id="password" name="password" value="${password }"/></td>
			</tr>
						<tr>
			<td colspan="2"><input type="submit" value="Login"/></td>
			<td><font color="red"><%=error %></font></td>
			</tr>
			<tr><td colspan="2"><a href="register.jsp">注册</a></td></tr>
	</table>
</form>
</body>
</html>