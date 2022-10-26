<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${ShirtByBrand}
${Records}
<br> ${RecordCount}

<form action="shirt/findBybrand">
Brand <input type="text" name="brand"/>

<input type="submit" value="search"/>
</form>
</body>
</html>