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
<h1>Song Details</h1>

<table border=1>
<thead>
			<tr>
				<th>SongName</th>
				<th>SingerName</th>
				<th>Duration</th>
				<th>Producer</th>
				<th>Lyrics</th>
				<th>Language</th>
				<th>Type</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${List}" var="song">
				<tr>
				<td>${song.name}</td>
				<td>${song.singer}</td>
				<td>${song.duration}</td>
				<td>${song.producer}</td>
				<td>${song.lyrics}</td>
				<td>${song.language}</td>
				<td>${song.type}</td>
				</tr>
		</c:forEach>
		</tbody>
		</table>
</body>
</html>