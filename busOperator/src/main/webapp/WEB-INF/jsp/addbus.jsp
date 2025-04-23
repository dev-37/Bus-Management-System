<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<body>
	<h1 style="text-align: center">Add new bus</h1>
	<form:form method="post" action="addbus" modelAttribute="bus">
		<style>
table, th, td {
	border: 1px solid black;
	padding: 10px
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>

		<table class="center" style="width: 30%">
			<tr>
				<td>Bus Name:</td>
				<td><form:input path="bus_name" required="true" /></td>
			</tr>
			<tr>
				<td>Bus Location:</td>
				<td><form:input path="location" required="true" /></td>
			</tr>
			<tr>
				<td>Ticket Price:</td>
				<td><form:input path="ticket_price" required="true" /></td>
			</tr>

			<tr>
				<td><input type="submit"
					style="background-color: yellow; color: red;" value="Add Bus" /></td>
			</tr>
		</table>

	</form:form>

	<br>
	<br>

	<a href="/busOperator"
		style="display: block; text-align: left; margin-top: 20px;">Go to
		Home</a>
</body>
</html>