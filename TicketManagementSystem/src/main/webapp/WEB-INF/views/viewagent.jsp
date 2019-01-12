<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Agent</title>
</head>
<body>
${message} <br><br>
Employee ID : ${emp_id} <br><br>
Employee Name : ${emp_name} <br><br>
Employee Number of Tickets : ${num_tickets} <br><br>
<form action="viewagent" method = "get">
<input type="submit" name="viewsubmit" value="Next">
</form>
</body>
</html>