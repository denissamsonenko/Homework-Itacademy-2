<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Web form</title>
	<meta charset="utf-8">
</head>
<body>

	<form action="ControllerForward" method="POST" >
		<input type="submit" value="forward()" />	<br/>		
	</form>
	
	<form action="ControllerSendRedirect" method="POST">
	<input type="submit" value="sendRedirect()" /> <br/>	
	</form>
	
</body>
</html>