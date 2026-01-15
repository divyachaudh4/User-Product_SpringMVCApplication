<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add New Product</h1>

<form action="addnewproduct" method="post">

<label>pName</label>
<input type="text" name="pName"><br><br>

<label>qty</label>
<input type="number" name="qty"><br><br>

<label>Price</label>
<input type="text" name="price"><br><br>

<input type="submit" value="Add New Product">
</form>

</body>
</html>