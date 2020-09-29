<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta content = "text/html" charset="UTF-8">
<title>All news</title>
</head>
<body>
<a href ="index.jsp">Go create news</a>
<div>
<c:forEach var="news" items="${newsList}">
	<div> 
	<c:out value="${news.date}" /><br>
	<c:out value="${news.title}" /><br>
	<c:out value="${news.brief}" /><br>
	<c:out value="${news.content}" /><br><br><br>
	</div>	
</c:forEach>
</div>
</body>
</html>