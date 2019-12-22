<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/insertdoctors" method="post" >
<table>
<tr>
<td>Enter Doctor ID:</td>
<td><input type="number" id="doctorId" name="doctorId"></td>
</tr>

<tr>
<td>Enter Doctor Name:</td>
<td><input type="text" id="doctorName" name="doctorName"></td>
</tr>


<tr>
<td><input type="submit" value="insert"/></td>
</tr>
</table>
</form>

<a href="/getform">back to home</a>
</body>
</html>