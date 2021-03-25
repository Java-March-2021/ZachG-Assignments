<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href= "css/styles.css">

<title>Date</title>
</head>
<body>
	
	<div>
		<fieldset>
		<legend>Today's Date</legend>
		<c:set var = "now" value = "${date}" />
		<h2><fmt:formatDate pattern = "EEEEEE, 'the' dd 'of' MMMM yyyy"  value = "${now}"/></h3> 
		<a href="/">Home Page</a>
		</fieldset>
	</div>


<script type="text/javascript" src="/js/dateAlert.js"></script>	
</body>
</html>