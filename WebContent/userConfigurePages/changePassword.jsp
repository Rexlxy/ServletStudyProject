<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkPassword(){
		var oldPW = document.getElementById("newPassword").value;
		var newPW = document.getElementById("repeatPassword").value;
		if(oldPW!=newPW){
			window.alert("两次输入的密码不一致");
			changePW.repeatPassword.focus();
			return false;
		}
		return true;
	}
</script>
<body>
<h1>修改密码</h1>
<form action="../changePassword" method="post" name="changePW" id="changePW" >
<table>
<tr>
<td>你的旧密码：</td>
<td><input type="password" name="oldPassword" id="oldPassword"></td>
</tr>
<tr>
<td>你的新密码：</td>
<td><input type="password" name="newPassword" id="newPassword"></td>
</tr>
<tr>
<td>请重复新的密码：</td>
<td><input type="password" name="repeatPassword" id="repeatPassword"></td>
</tr>
<tr>
<td colspan="2"><button type="submit" onclick="return checkPassword()">确定</button></td>
<td colspan="2"><a href="userConfigures.jsp">返回</a></td>
</tr>
</table> 
</form>
</body>
</html>