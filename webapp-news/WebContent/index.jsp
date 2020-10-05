<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Index</title>
	<meta  content="text/html" charset="utf-8">
</head>
<body>
<form action="controller" method="post">
	<input type="hidden" name="command" value="save_news">
	<div>
		<textarea name="title" placeholder="title" maxlength="100"></textarea>
	</div>
	<div>
		<textarea name="brief" placeholder="brief" maxlength="200"></textarea>
	</div>
	<div>
		<textarea name="content" placeholder="content" maxlength="200"></textarea>	
	</div>
		<input type="submit" name="sub" value="Send" />
		<input type="reset" name="reset" value="reset">
</form>	
<br>
<a href = "controller?command=show_news">Show all news</a>
</body>
</html>