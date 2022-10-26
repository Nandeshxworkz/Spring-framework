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

	<h1>Login Details Are Displayed Here</h1>

	<table border=1> 
		<thead>
             <tr>
             <th>User Name</th>
             <th>Email Id</th>
             <th>Profile Picture</th>
             </tr>
		</thead>
		<tbody>
		<c:forEach var="login" items="${LoginDetails}">
		<tr>
		<td>${login.userName}</td>
		<td>${login.email}</td>
		<td>${login.image}</td>
		</tr>
		</c:forEach>
		
		</tbody>
		
	</table>


</body>
</html>

