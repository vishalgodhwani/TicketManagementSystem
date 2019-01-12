<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
${output}<br><br>
Ticketing System<br><br>
<form method ="post" action="userselectpage">
<input type="radio" name = "user" value="agentlogin"/>Agent Login<br><br>
<input type="radio" name = "user" value="adminlogin"/>Admin Login<br><br>
<input type="submit" name="submithome" value="Submit"/>
</form>
</body>
</html>