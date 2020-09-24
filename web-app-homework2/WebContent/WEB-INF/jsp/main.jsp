<%@ page language="java" import="by.htp.les02.entity.User" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>autorizationInfo</title>
	<meta charset="utf-8">
</head>
<body>
	<h1 align="center">Info</h1>
	<table border="4" bordercolor="black" align="center" >
		<tr style="background: gray" >
			<th>Name</th>
			<th>Surname</th>
			<th>Password</th>
			<th>Id</th>
			<th>Mail</th>
			<th>Address</th>
			<th>Age</th>
		</tr>
		<tr style="background: snow">
			<td>
			<jsp:useBean id="user" class="by.htp.les02.entity.User" scope="request" />
			<jsp:getProperty property="firstName" name="user"/></td>
			<td><jsp:getProperty property="surname" name="user"/></td>
			<td><jsp:getProperty property="password" name="user"/></td>
			<td><jsp:getProperty property="id" name="user"/></td>
			<td><jsp:getProperty property="mail" name="user"/></td>
			<td><jsp:getProperty property="address" name="user"/></td>
			<td><jsp:getProperty property="age" name="user"/></td>
		</tr>
	</table>
		<a href="index.jsp">Go back</a>
</body>
</html>