<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Web form</title>
	<meta charset="utf-8">
</head>
<body>
	<form action="controller" method="post" >
		<input type="hidden" name="command" value="save_news" />		
		<input type="text" name="title" maxlength="12" placeholder="title" autofocus value="" /> <br>
		<input type="text" name="brief" maxlength="12" placeholder="brief" value="" /> <br>
		
		<input type="submit" name="sub" value="Send" /> <br>
	</form>
</body>
</html>