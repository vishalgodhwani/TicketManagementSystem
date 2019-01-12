<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Ticket</title>
</head>
<body>
${message}<br><br>
Enter the below details : <br><br>
<form action="/addticket" method="post">
Enter employee id : <input type="text" name="emp_id">
<input type="submit" name="submitaddticket" value="Submit"/>
</form>
</body>
</html>