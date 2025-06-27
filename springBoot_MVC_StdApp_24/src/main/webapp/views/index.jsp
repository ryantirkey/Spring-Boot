<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>Student Enquiry Form</h3>
	
	<h3>${msg}</h3>

	<form:form action="save" modelAttribute="student" method="POST">

		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobutton path="gender" value="Male" /> Male <form:radiobutton
						path="gender" value="Female" /> Female</td>
			</tr>

			<tr>
				<td>Courses :</td>
				<td><form:select path="course">
						<%-- <form:option value=""> -Select-</form:option>
						<form:option value="Java"> Java</form:option>
						<form:option value="Python"> Python </form:option>
						<form:option value="ReactJs"> ReactJs</form:option> Hard Coded in UI--%>

						<form:options items="${courses}" />
					</form:select></td>
			</tr>

			<tr>
				<td>Timings :</td>
				<%-- <td><form:checkbox path="timings" value="Morning" /> Morning <form:checkbox
						path="timings" value="AfterNoon" /> AfterNoon <form:checkbox
						path="timings" value="Evening" /> Evening</td> Hard Coded in UI--%>
					<td>
						<form:checkboxes items="${timings}" path="timings"/>
					</td> 
			</tr>
			<tr>
				<td><form:button>Submit</form:button></td>
			</tr>
		</table>

	</form:form>

</body>
</html>