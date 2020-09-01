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
		<input type="hidden" name="command" value="save_new_user" />		
		<input type="text" name="firstName" maxlength="12" placeholder="name" autofocus value="" /> <br>
		<input type="text" name="surname" maxlength="12" placeholder="surname" value="" /> <br>
		
		<input type="submit" name="sub" value="Send" /> <br>
	</form>
</body>
</html>