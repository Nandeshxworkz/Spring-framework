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

<h1>Shirt Details</h1>
<form action="shirt" method="post">"

<pre>


Brand : <input type="text" name="brand">

Size : <select name="size">
<option>Small</option>
<option>Large</option>
<option>Medium</option>
<option>Xl</option>
<option>XXl</option>
<option>XXXl</option>
</select>

Price : <input type="text" name="price">

Discount : <select name="discount">
<option>5%</option>
<option>10%</option>
<option>15%</option>
<option>20%</option>
<option>40%</option>

</select>

Quantity : <select name="quantity">
<option>1</option>
<option>100</option>
<option>300</option>
<option>500</option>
<option>1000</option>
</select>

Gender : <input type="radio" name="gender" value="Male">Male
         <input type="radio" name="gender" value="Female">Female
         <input type="radio" name="gender" value="others">others

Color : <select name="color">
<option>White</option>
<option>Black</option>
<option>Red</option>
<option>Blue</option>
<option>Silver</option>
</select>

<input type="submit" value="Save">


</pre>
</form>	
</body>
</html>