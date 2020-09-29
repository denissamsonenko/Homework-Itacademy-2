<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta content = "text/html" charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4> <c:out  value = "${requestScope.error}"/><br>	</h4>
	<a href = "index.jsp">go to create news</a><br>
	
<form action="shownews" metod="post">
	<input type="hidden" name="command" value="show_news">
	<input type="submit" name="sub" value="gonews" />
</form>
</body>
</html>