<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%= request.getServletContext().getContextPath()%>/">
<meta charset="UTF-8">
<title>错误</title>
</head>
<body>

	不好意思，你访问的页已经去<b style="color: red;font-size: x-large;">火星</b>了,要去火星才能见到你要的页面。<br>
	好看的错误页面<br>
	<a href="<%= request.getServletContext().getContextPath()%>/toLogin">重新开始操作</a>
</body>
</html>