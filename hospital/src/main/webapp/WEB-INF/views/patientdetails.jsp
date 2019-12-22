<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="/insertpatient" method="post" >
<table>
<tr class="success">
<td>Enter Patient Id:</td>
<td><input type="number" id="patientId" name="patientId"></td>
</tr>
<tr>
<td>Enter Patient Name:</td>
<td><input type="text" id="patientName" name="patientName"></td>
</tr>
<tr>
<td>Enter Patient Bill:</td>
<td><input type="number" id="patientBill" name="patientBill"></td>
</tr>
</table>

<label for="doctorName" class="control-label"> SELECT DOCTOR:</label>
 <table class="table table-striped">
			
				<tr class="success">
					

					<td><select name="doctorName">
							<c:forEach var="str2" items="${doctors}">
								<option value="${str2.doctorName}">${str2.doctorName}</option>
							</c:forEach>
					</select></td>

				</tr>
				<tr>
					<td><input type="submit" value="insert"/></td>
					</tr>
					
			</table>
</form>

<a href="/getform"><button>Back to Home</button></a>

</body>
</html>