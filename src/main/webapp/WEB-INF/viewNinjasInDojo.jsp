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
		<h1>
			View Ninjas from
			<c:out value="${dojo.name}"></c:out>
		</h1>
		<table class="table table-bordered">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</tr>

			<c:forEach var="oneNinja" items="${ninjas}">
				<tr>
					<td><c:out value="${oneNinja.firstName }"></c:out></td>
					<td><c:out value="${oneNinja.lastName }"></c:out></td>
					<td><c:out value="${oneNinja.age }"></c:out></td>

				</tr>

			</c:forEach>
		</table>

	</div>

</body>
</html>