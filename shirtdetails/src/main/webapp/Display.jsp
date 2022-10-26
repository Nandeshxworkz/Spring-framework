<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Shirt Deatils Are Displayed Here</h1>
	<br> ${RecordCount}

	<table border=1>
		<thead>
			<tr>
			<th>Shirt Brand</th>
			<th>Shirt size</th>
			<th>Shirt price</th>
			<th>Shirt Discount</th>
			<th>Shirt Quntity</th>
			<th>Shirt Gender</th>
			<th>Shirt Color</th>
			</tr>
			
		</thead>
		
		<tbody>
		<c:forEach var="shirt" items="${ShirtDetails}">
		<tr>
		<td>${shirt.brand }</td>
		<td>${shirt.size }</td>
		<td>${shirt.price }</td>
		<td>${shirt.discount }</td>
		<td>${shirt.quantity }</td>
		<td>${shirt.gender }</td>
		<td>${shirt.color }</td>
		</tr>
		</c:forEach>
		
		</tbody>

	</table>

</body>
</html>