<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${dto}
<pre>
<form action="Suicide.do" method="post">
Name : <input type="text" name="name"/>
Age : <input type="text" name="age"/>
Gender: <input type="radio" name="Gender" value="Female"/>Female
        <input type="radio" name="Gender" value="Male"/>Male
        <input type="radio" name="Gender" value=Trans Gender/>Trans Gender
        
Reason : <textarea rows="3" cols="20" name="reason"></textarea>        
No of Attempts : <input type="text" name="attempts">
Spot : <input type="text" name="spot">
Date and Time : <input type="text" name="dateandtime"/>
Type : <select name="type">
<option>Poision</option>
<option>Jumping from Building</option>
<option>Jumping into bavi,kere,halla</option>
<option>Hanging</option>
</select>
<input type="submit" value="send">
</pre>
</form>

</body>
</html>