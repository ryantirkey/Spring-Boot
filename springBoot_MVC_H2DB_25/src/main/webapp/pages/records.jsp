<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<a href="/">+ Add More Products</a>
	<table border="1">
		<thead>
			<tr>
				<th>S.no</th>
				<td>Name</td>
				<td>Price</td>
				<td>Quantity</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach  var="p" items="${product}" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${p.name}</td>
					<td>${p.price}</td>
					<td>${p.qty}</td>
				</tr>
			
			</c:forEach>
		
		</tbody>

	</table>


</body>
</html>