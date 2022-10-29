<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Confirmation Message:${Mesg}

<h1>--   Login Page   --</h1>

<form action="login" method="post" enctype="multipart/form-data">
<pre>
User Name : <input type="text" name="userName"/>

Email : <input type="text" name="email"/>

Profile Picture : <input type="file" name="image"/>

              <input type="submit" value="Save"/>

</pre>
</form>
 <a href="searchByUserName.jsp"> Search By Username </a> 
</body>
</html>