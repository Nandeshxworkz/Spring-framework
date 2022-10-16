<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>------ Worlds Criminal Data -----</h1>

	<form action="criminal" method="post">

		<pre>

Criminal Name : <input type="text" name="name">

Age : <select name="age">
      <option>select</option>
      <c:forEach begin="12" end="100" var="criminals">
      <option value="${criminals}">${criminals}</option>
      </c:forEach>
      </select>
      
Country : <select name="country">
          <option>America</option>
          <option>India</option>
          <option>Italy</option>
          <option>Singapore</option>
          <option>Soudi Arabia</option>
          <option>Pakistan</option>
          <option>China</option>
          <option>Russia</option>
          </select>      
  
Criminal Type : <select name="criminalType">
                <option>Cyber crime</option>
                <option>Robbery</option>
                <option>Kidnapping</option>
                <option>Assault</option>
                <option>Theft</option>
                <option>Violence</option>
                <option>White-collar crime</option>
                <option>Terrorism</option>
                <option>Drug trafficking</option>
                <option>Ganja</option>
                </select>  
                
No of Cases : <select name="noOfCases">
              <option>select</option>
              <c:forEach begin="1" end="100" var="cases">
              <option value="${cases}">${cases}</option>
              </c:forEach>
              </select>
              
Alive : <input type="radio" name="alive" value="Yes">Yes 
        <input type="radio" name="alive" value="No">No             

Gender : <input type="radio" name="gender" value="Male">Male
         <input type="radio" name="gender" value="Female">Female
         <input type="radio" name="gender" value="others">others
         
International : <input type="radio" name="international" value="Yes">Yes 
                <input type="radio" name="international" value="No">No     
              
Married : <input type="radio" name="married" value="Yes">Yes 
          <input type="radio" name="married" value="No">No 
          
Jail Term : <select name="jailTerm">
            <option>6 Months</option>
            <option>1Year</option>
            <option>2Year</option>
            <option>3Year</option>
            <option>4Year</option>
            <option>5Year</option>
            <option>6Year</option>
            <option>7Year</option>
            <option>8Year</option>
            </select>  
            
Wife Name : <input type="text" name="wifeName"> 

Right Hand Name : <input type="text" name="rightHandName">      

left Hand Name : <input type="text" name="leftHandName">  

Prison Name : <input type="text" name="prisonName">  

Net worth : <input type="text" name="netWorth"> 

                  <input type="submit" value="Save Record" >        
                  
                  <a href="showAll">Show All</a>                     
  
</pre>
	</form>
</body>
</html>


