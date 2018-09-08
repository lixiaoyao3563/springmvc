<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br><br>
	<a href="springmvc/testCookieValue">testCookieValue</a>

	<br><br>
	<a href="springmvc/testRequestHeader">testRequestHeader</a>
	
	<br><br>
		<a href="springmvc/testRequestParam?username=zhangsan&password=123456">testRequestParam</a>
	<br><br>
	
	<a href="hello">hello</a>
	
	<br><br>
	
	<a href="springmvc/testAntPath/*/test">testAntPath</a>
	
	<br><br>
	
	<form action="springmvc/testParamsAndHeaders" method="post">
		<input type="submit" value="submit">
	</form>
	
	<br><br>
	
	<a href="springmvc/testPathVariable/1">testPathVariable</a>
	
	<br><br>--------------------------------<br><br>
	
	<a href="springmvc/testRest/1">testRestGET</a>
	<br>
	<form action="springmvc/testRest" method="post">
		<input type="submit" value="testRestPOSt">
	</form>
	<br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="testRestPUT">
	</form>
	<br>
	<form action="springmvc/testRest/1" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="testRestDELETE">
	</form>
	
	
	
</body>
</html>