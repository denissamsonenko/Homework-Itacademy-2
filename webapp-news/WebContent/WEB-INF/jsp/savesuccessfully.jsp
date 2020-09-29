<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>News Save</title>
</head>
<body>
<div>
News SAVE DB Successfully
</div>
<a href = "index.jsp" >
Create news
</a>
<form action="shownews" metod="post">
<input type="hidden" name="command" value="show_news">
<input type="submit" name="sub" value="gonews" />
</form>
</body>
</html>