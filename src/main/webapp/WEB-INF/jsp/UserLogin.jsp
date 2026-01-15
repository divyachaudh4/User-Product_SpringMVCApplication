<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="<c:url value='/resources/css/login.css' />">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>User login </h1>
<form action="login">


<label class="userEmail">userEmail</label>
<input type="text" name="userEmail"><br><br>

<label class="password">password</label>
<input type="password" name="password"><br><br>

<input type="submit" value="Login">
</form>
</body>
</html>