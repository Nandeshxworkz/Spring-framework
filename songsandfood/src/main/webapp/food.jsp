<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="foood.do" method="post">
<h1>Adding food Details</h1>

<pre>
FoodName : <input type="text" name="name"/>

Price : <input type="text" name="price"/>

Hotel Name : <select name="hotelName">
             <option>select hotel</option>
             <option>Bawarchi hotel</option>
             <option>Udupi hotel</option>
             <option>Malasa mangalya hotel</option>
             <option>Tandoori hotel</option>
             <option>Pallavi hotel</option>
             <option>Marata Swad hotel</option>
          </select> 
          
Type : <input type="text" name="type"/>

Location : <input type="text" name="location"/>

Ordered : <select>
          <option>Online ordered</option>
          <option>Offline ordered</option>
          </select>    
          
Quantity : <select>
           <option>1</option>
           <option>2</option>
           <option>3</option>
           <option>4</option>
           <option>5</option>
           <option>6</option>
           <option>7</option>
           <option>8</option>
           <option>9</option>
           </select> 
           
           <input type="submit" value="Add"/>              
      </pre> 
      </form>   
 </body>
 </html>         
