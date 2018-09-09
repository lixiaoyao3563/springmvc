<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="springmvc/testFileUpload" method="post" enctype="multipart/form-data">
		file:<input type="file" name="file"><br>
		desc:<input type="text" name="desc"><br>
		<input type="submit" value="submit">
	</form>
	<br><br>

	<a href="springmvc/testJson">testJson</a>
	<br><br>

	<a href="springmvc/testView">testView</a>
	<br><br>
	
	<form action="springmvc/testModelAttribute" method="post">
		<input type="hidden" name="id" value="1"><br>
		username:<input type="text" name="username" value="Tom"><br>
		email:<input type="text" name="email" value="Tom@qq.com"><br>
 		age:<input type="text" name="age" value="12"><br>
 		<input type="submit" value="submit"><br>
	</form>
	<br><br>

	<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
	<br><br>

	<a href="springmvc/testMap">testMap</a>
	<br><br>

	<a href="springmvc/testModelAndView">testModelAndView</a>
	<br><br>

	<a href="springmvc/testServletAPI">testServletAPI</a>
	<br><br>
	
	<form action="springmvc/testPojo" method="post">
		username:<input type="text" name="username"><br>
		password:<input type="password" name="password"><br>
		email:<input type="text" name="email"><br>
		age:<input type="text" name="age"><br>
		province:<input type="text" name="address.province"><br>
		city:<input type="text" name="address.city"><br>
		<input type="submit" value="submit">
	</form>

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