<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>注册界面</h1>
<form action="register" method="post" >
<table>
<tr>
<td>你的用户名：</td>
<td><input type="text"name="newUserName" id="newUserName" ></td>
</tr>

<tr>
<td>你的密码：</td>
<td><input type="password" name="newPassword" id="newPassword"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="确认注册"></td>
<td><a href="login.jsp">返回登录界面</a></td>
</tr>
</table>
</form>
</body>
</html>