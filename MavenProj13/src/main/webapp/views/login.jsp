<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="j_security_check">
  <label>UserName : </label>
  <input name="j_username" type="text">
  <label>Password : </label>
  <input name="j_password" type="password">
  <input type="submit" value="Login">
</form>



</body>
</html>