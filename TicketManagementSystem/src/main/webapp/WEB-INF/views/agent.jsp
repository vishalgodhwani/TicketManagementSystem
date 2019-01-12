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
Please enter the below details : <br><br>
<form method="post" action="validateagent">
Employee ID : <input type="text" name="emp_id"> <br> <br>
Password : <input type="password" name="password"> <br> <br>
<input type="submit" name="submitagent" value="Login"/><br><br>
</form>
</body>
</html>