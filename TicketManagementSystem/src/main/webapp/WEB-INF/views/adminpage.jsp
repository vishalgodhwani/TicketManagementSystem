<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
${output}<br><br>
${success}<br><br>
Select an option : <br><br>
<form action="admintask" method="post">
<input type="radio" name = "admintask" value="addticket"/>Add Ticket<br><br>
<input type="radio" name = "admintask" value="addagent"/>Add Agent<br><br>
<input type="radio" name = "admintask" value="removeagent"/>Remove Agent<br><br>
<input type="radio" name = "admintask" value="viewagentlist"/>View Agent List<br><br>
<input type="radio" name = "admintask" value="logout"/>Logout<br><br>
<input type="submit" name="submitadmintask" value="Submit"/>
</form>
</body>
</html>