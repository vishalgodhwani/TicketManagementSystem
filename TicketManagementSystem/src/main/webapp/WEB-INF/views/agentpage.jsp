<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Page</title>
</head>
<body>
${output}<br><br>
<form action="agenttask" method="post">
Select an option : <br><br>
<input type="radio" name = "agenttask" value="updateticket"/>Upadate Ticket<br><br>
<input type="radio" name = "agenttask" value="logout"/>Logout Agent<br><br>
<input type="submit" name="submitagenttask" value="Submit"/>
</body>
</html>