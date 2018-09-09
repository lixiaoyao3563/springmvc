<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- isErrorPage="true" fix tomcat8  view problem ,lower version is ok-->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>success</h2>
	<hr>
	time:${requestScope.time }
	<hr>
	names:${requestScope.names }
	
	<hr>
	requestScope user:${requestScope.user }<br>
	sessionScope user:${sessionScope.user }<br>
	
	requestScope address:${requestScope.address }<br>
	sessionScope address:${sessionScope.address }<br>
	<hr>
	<fmt:message key="i18n.username"></fmt:message><br>
	<fmt:message key="i18n.password"></fmt:message>
</body>
</html>