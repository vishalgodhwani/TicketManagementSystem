<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
${output}<br><br>
Please enter the below details : <br> <br>
<form method="post" action="validateadmin">
Name : <input type="text" name="name"> <br> <br>
Password : <input type="password" name="password"> <br> <br>
<input type="submit" name="submitadmin" value="Login"/><br><br>
</form>
</body>
</html>