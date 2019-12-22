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
<title>Spring Boot</title>
<body>
	<div class="form">
		<form method="/post" action="/viewdetails">
			 <table class="table table-striped">
			
				<tr class="table-primary">
					<td>Doctor Name:</td>

					<td><select name="doctors">
							<c:forEach var="str2" items="${doctors}">
								<option>${str2.doctorName}</option>
							</c:forEach>
					</select></td>

				</tr>
				<tr>
					<td><input type="submit" value="View Details" /></td>
					</tr>
					
			</table>

		</form>
		
		</div>
		<table border="3" width="70%" cellpadding="2" class="table">
		<tr class="success">
		<th>PATIENT ID</th>
		<th>PATIENT NAME</th>
		<th>PATIENT BILL</th>
		</tr>
		<c:forEach var="pat" items="${patients}">
		<tr class="danger">
		<td>${pat.patientId}</td>
		<td>${pat.patientName}</td>
		<td>${pat.patientBill}</td>
		</tr>
		</c:forEach>
		</table>
		<a href="/getform"><button>Back to home</button></a>
	</body>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
