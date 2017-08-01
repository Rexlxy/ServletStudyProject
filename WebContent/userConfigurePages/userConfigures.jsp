<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>账户管理</h1>
<div>
当前用户：${currentUser.userName } <br/>
<a href="changePassword.jsp">修改密码</a><br/>
<a href="changeUserName.jsp">修改用户名</a>
<a href="../main.jsp">返回主页</a>
</div>
</body>
</html>