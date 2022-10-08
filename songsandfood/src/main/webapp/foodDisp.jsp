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
	<h1>All food item Details</h1>

	<table border=1>

		<thead>
			<tr>
				<th>FoodName</th>
				<th>Price</th>
				<th>HotelName</th>
				<th>Type</th>
				<th>Location</th>
				<th>Ordered</th>
				<th>Quantity</th>
			</tr>
		</thead>
        <tbody>
        <c:forEach items="${list}" var="food">
        <tr>
        <td>${food.foodName}</td>
        <td>${food.price}</td>
        <td>${food.hotelName}</td>
        <td>${food.type}</td>
        <td>${food.location}</td>
        <td>${food.ordered}</td>
        <td>${food.quantity}</td>
        </tr>
        </c:forEach>
        
        </tbody>


	</table>

</body>
</html>