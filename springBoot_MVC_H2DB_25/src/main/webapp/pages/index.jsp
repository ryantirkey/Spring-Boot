<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Store Product</title>
</head>
<body>

	<h3>Store Product</h3>
	<h3>${msg}</h3>

	<form:form action="save" modelAttribute="product" method="POST">

		<table>
			<tr>
				<td>Name :</td>
				<td> <form:input path="name"/> </td>
			</tr>
			<tr>
				<td>Price :</td>
				<td> <form:input path="price"/> </td>
			</tr>
			<tr>
				<td>Quantity :</td>
				<td> <form:input path="qty"/> </td>
			</tr>
			<tr>
				<td> <input type="submit" value="save"  /> </td>
			</tr>

		</table>

	</form:form>
	
	<a href="data">View Records</a>


</body>
</html>