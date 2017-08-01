<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>目标页</h1>
<h1>request: <%=request.getAttribute("requestKey") %></h1><br/>
<h1>session: <%=session.getAttribute("sessionKey") %></h1><br/>
<h1>application: <%=application.getAttribute("applicationKey") %></h1><br/>
</body>
</html>