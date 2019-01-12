<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Agent</title>
</head>
<body>
Please enter the below details : <br><br>
<form action="newagent" method="post">
Employee ID = <input type="text" name="emp_id"><br><br>
Employee Name = <input type="text" name="emp_name"><br><br>
Employee Age = <input type="text" name="emp_age"><br><br>
Employee Password = <input type="password" name="emp_password"><br><br>
Number of Tickets  = <input type="text" name="emp_tickets"><br><br>
<input type="submit" name="submitaddagent" value="Submit"/>
</form>
</body>
</html>