<%@ page language="java" import ="by.htp.itacademy.entity.News" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta  content="text/html" charset="UTF-8">
<title>show news</title>
</head>
<body>
	<div<c:out value="${news.date}"></c:out>></div>
	<div><c:out value="${news.title}"></c:out></div>
	<div><c:out value="${news.brief}"></c:out></div>
	<div><c:out value="${news.content}"></c:out></div>
	<div><a href="controller?command=find_for_delete&id=${news.id}">Edit</a></div>
	<div><a href="controller?command=delete_news&id=${news.id}">delete</a></div>
	<div><a href="controller?command=show_news">Show all news</a></div>
</body>
</html>