<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Product details</h1>
<form action="updateProduct" method="post">

    <input type="hidden" name="pId" value="${product.pId}" />

    Name:
    <input type="text" name="pName" value="${product.pName}" /><br><br>

    Price:
    <input type="text" name="price" value="${product.price}" /><br><br>

    Quantity:
    <input type="text" name="qty" value="${product.qty}" /><br><br>

    <input type="submit" value="Update Product" />
</form>
</body>
</html>