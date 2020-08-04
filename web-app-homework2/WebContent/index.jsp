<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Web form</title>
	<meta charset="utf-8">
</head>
<body>
	<form action="myurl" method="GET" >
		<input type="hidden" name="command" value="forward" />		
		<input type="text" name="firstName" maxlength="12" placeholder="name" autofocus value="" /> <br>
		<input type="text" name="surname" maxlength="12" placeholder="surname" value="" /> <br>
		<input type="password" name="password" placeholder="password" value="" /> <br>
		<input type="text" name="id" placeholder="ID" value="" /> <br>
		<input type="text" name="mail" placeholder="mail" value="" /> <br>
		<input type="text" name="address" placeholder="address" value="" /> <br>
		<input type="text" name="age" value="" placeholder="age"/> <br>
		
		<input type="reset" name="reset" value="Reset" />
		<input type="submit" name="sub" value="Send" /> <br>
	
	</form>
</body>
</html>