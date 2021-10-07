<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add ninja</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	<div class="container w-25">
		<h1>New Ninja</h1>
		<form:form action="/new/ninja" method="post" modelAttribute="ninja"
			class="d-flex flex-column">
			<form:label path="firstName">First Name:</form:label>
			<form:input path="firstName"></form:input>
			<form:label path="lastName">Last Name:</form:label>
			<form:input path="LastName"></form:input>
			<form:label path="age">Age:</form:label>
			<form:input path="age" type="number" min= "0"></form:input>
			<form:label path="dojo">Dojo:</form:label>
			<form:select path="dojo">
				<c:forEach var="oneDojo" items="${dojos }">
					<option value="${oneDojo.id }">${oneDojo.name}</option>
				</c:forEach>
			</form:select>

			<input type="submit">
		</form:form>
	</div>

</body>
</html>