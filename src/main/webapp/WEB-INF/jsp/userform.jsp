<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/css/style.css" var="cssPath" />
<link rel="stylesheet" href="${cssPath}">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to User Registration</h1>
<form action="saveuser">

<label>userName</label>
<input type="text" name="userName"><br><br>

<label>userAddress</label>
<input type="text" name="userAddress"><br><br>

<label>userEmail</label>
<input type="text" name="userEmail"><br><br>

<label>password</label>
<input type="password" name="password"><br><br>

<label>phno</label>
<input type="number" name="phno"><br><br>

<input type="submit" value="create user">
</form>
</body>
</html>