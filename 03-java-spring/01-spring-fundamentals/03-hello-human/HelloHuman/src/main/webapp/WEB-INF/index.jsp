<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Hello <c:out value="${fname}"/> <c:out value="${lname}"/></h1>

<p>Welcome to SpringBoot!</p>

<button>Go Back</button>

</body>
</html>