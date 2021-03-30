<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Code</title>
<link rel = "stylesheet" href = "css/index.css" />
</head>
<body>
	<form action = "/attempt" method = "POST">
		<span><c:out value = "${error}" /></span>
		<h1>What is the code?</h1>
		<label><input type = "text" name = "codeguess"></label>
		<button>Submit</button>
	</form>
</body>
</html>