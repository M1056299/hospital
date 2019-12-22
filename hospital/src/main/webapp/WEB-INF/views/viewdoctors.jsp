<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
<title>Spring Boot</title>
<body>
	<div class="form">
		<form method="/post" action="/displaydoctors">
			<table border="3" width="70%" cellpadding="2" class="table">
			
				<tr class="success">
		<th>Doctor Id</th>
		
		<th>Doctor Name</th>
		
		<th>Doctor Salary</th>
		</tr>
		<c:forEach var="doc" items="${list}">   
   <tr class="danger"> 
   <td>${doc.doctorId}</td>  
   <td>${doc.doctorName}</td>  
   <td>${doc.doctorBill}</td>  
 
   </tr>  
   </c:forEach>  			
			</table>

		</form>
		</div>
		<hr>
	<a href="/getform"><button>Back To Home</button></a>
	</body>
	</html>