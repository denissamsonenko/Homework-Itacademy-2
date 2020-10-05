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
<header>
<h1>News List</h1>
<nav>
<div><a href ="index.jsp">Create news</a></div>
</nav>
</header><br>
<c:forEach var="news" items="${requestScope.newsList}">
<a href="controller?command=find_by_id&id=${news.id}">
${news.date}<br>
${news.title}
</a><br><br>	
</c:forEach>
</body>
</html>