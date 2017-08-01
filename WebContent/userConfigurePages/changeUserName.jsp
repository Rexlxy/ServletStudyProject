<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>修改用户名</h1>
<form action="../changeUserName" method="post" >
<table>
<tr>
<td>你的新用户名：</td>
<td><input type="text" name="newUserName" id="newUserName"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="确定"/></td>
<td colspan="2"><a href="userConfigures.jsp">返回</a></td>
</tr>
</table> 
</form>
</body>
</html>