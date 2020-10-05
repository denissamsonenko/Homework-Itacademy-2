<%@ page language="java" import ="by.htp.itacademy.entity.News" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta  content="text/html" charset="UTF-8">
<title>update</title>
</head>
<body>
<form action="update" method="post">
	<input type="hidden" name="command" value="update_news">
	<input type="hidden" name="id" value="${news.id}">
	<div>${news.date}</div>
	<div><textarea name="title" maxlength="100">${news.title}</textarea></div>
	<div><textarea name="brief" maxlength="200">${news.brief}</textarea></div>
	<div><textarea name="content" maxlength="200">${news.content}</textarea></div>
		<input type="submit" name="update" value="update" />
</form>	
</body>
</html>