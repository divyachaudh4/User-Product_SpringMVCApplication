<%@page import="com.soft.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/resources/css/dashboard.css" var="cssPath" />
<link rel="stylesheet" href="${cssPath}">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 class="head">Product Dashboard</h1>
<button><a href="newProductform">Add New Product</a></button><br><br>
<table style="border: 1px solid black">
<tr>
<th>pId</th>
<th>pName</th>
<th>qty</th>
<th>Price</th>
<th>Operations</th>
</tr>

<% List<ProductModel> allproductList = (List<ProductModel>) request.getAttribute("addproduct");%>
<% for(ProductModel p:allproductList){ %>

<tr>
<td><%=p.getpId() %></td>
<td><%=p.getpName() %></td>
<td><%=p.getQty() %>
<td><%=p.getPrice() %></td>
<td>
<a href="editProduct?pId=<%=p.getpId()%>"> <button>Edit</button></a>
<a href="deleteproduct?pId=<%=p.getpId()%>" onclick="return confirm('Are you sure to delete this record' );"><button>Delete</button></a>
</td>
</tr>
<%} %>
</table>

</body>
</html>