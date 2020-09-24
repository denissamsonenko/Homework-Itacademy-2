<%@ page language="java" import ="by.htp.itacademy.entity.News" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  content="text/html" charset="UTF-8">
<title>Main</title>
</head>
<body>
<form>
	<div>
	<jsp:useBean id="news" class="by.htp.itacademy.entity.News" scope="request" />
	<jsp:getProperty property="title" name="news"/>
	</div>
	<div>
		<jsp:getProperty property="brief" name="news"/>
	</div>
	<div>
		<jsp:getProperty property="content" name="news"/>
	</div>
	<a href = "index.jsp">GO INDEX</a>
</form>
</body>
</html>