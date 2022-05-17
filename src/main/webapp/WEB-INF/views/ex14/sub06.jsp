<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.1.3/css/bootstrap.min.css" integrity="sha512-GQGU0fMMi238uA+a/bdWJfpUGKUkBdgfFdgBm72SUQ6BeyWjoY/ton0tEjH+OSH9iP4Dfh+7HM0I9f5eR0L/4w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" referrerpolicy="no-referrer"></script>

<title>Insert title here</title>
</head>
<body>

	<c:url value="/ex14/sub06" var="employeeUrl"></c:url>
	
	<h1>${message }</h1>

	<h1>직원등록</h1>
	<form action="${employeeUrl }" method="post">
	First Name : <input type="text" name="FirstName" value="donald"/><br/>
	Last Name : <input type="text" name="lastName" value="trump"/><br/>
	Birth Date : <input type="date" name="birthDate"/><br/>
	Photo : <input type="text" name="photo" value="photo9999" /><br/>
	Notes : <textarea name ="notes" id="" cols="30" rows="10">US President....</textarea> <br />
	
	<button>등록</button>
	</form>
</body>
</html>