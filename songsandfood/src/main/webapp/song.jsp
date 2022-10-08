<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="music.do" method="post">
		<h1>Adding song Details</h1>
		<pre>

SongName : <input type="text" name="name" />

Singer : <input type="text" name="singer" />

Duration : <input type="text" name="duration" />

Producer : <input type="text" name="producer" />

Lyrics : <input type="text" name="lyrics" />

Language : <select name="language">
           <option>Kannada</option>
           <option>English</option>
           <option>Hindi</option>
           <option>Telugu</option>
           <option>Tamil</option>
           </select>
           
 Type : <select name="type">
        <option>Folk</option>
        <option>Country Music</option>
        <option>Rock</option>
        <option>Classical Music</option>
        </select>  
        </pre>

		<input type="submit" value="Add" />
	</form>
</body>
</html>