<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap-theme.min.css">
<script
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.js">
</script>
<script
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
.c {
	border: 2px solid blue;
}
</style>
</head>
<%
	String error = (String) request.getAttribute("error");
	if (error == null) {
		error = "";
	}
%>
<body style="padding:100px">


	<div class="container">
			<div class="col-md-6 col-md-offset-3">
			<h1 align="center">用户登录</h1>
			<form class="form-horizontal" action="login" method="post" style="padding:40px">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="userName" name="userName"
							placeholder="用户名" value="${userName }">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="password" name="password"
							placeholder="密码" value="${password }">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10"></div>
				</div>
				
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-4">
						<button type="submit" class="btn btn-default">Sign in</button>
					</div>
					<div class="col-sm-4">
						<font color="red">${error }</font>
					</div>

				</div>
				
				<div class="form-group">
				<div class="col-sm-offset-2 col-sm-3">
						还没有账号？
					</div>
					<div class="col-sm-7">
						<a href="register.jsp">立即注册</a>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>


</html>