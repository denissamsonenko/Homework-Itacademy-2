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
		<textarea name="title" placeholder="title" maxlength="100"> title</textarea>
	</div>
	<div>
		<textarea name="brief" placeholder="title" maxlength="200"> brief</textarea>
	</div>
	<div>
	<textarea name="content" placeholder="title" maxlength="200"> content</textarea>	
	</div>
	<input type="submit" name="sub" value="Send" />
	<button type="reset">reset</button>
</form>	
</body>
</html>