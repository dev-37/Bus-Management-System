<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<body>
	<h1 style="text-align: center">Delete below bus?</h1>
	<form:form method="post" action="deletebus" modelAttribute="bus">
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
				<td>Bus ID:</td>
				<td><form:hidden path="bus_id" />${bus.getBus_id()}</td>
			</tr>
			<tr>
				<td>Bus Name:</td>
				<td><form:hidden path="bus_name" />${bus.getBus_name() }</td>
			</tr>
			<tr>
				<td>Bus Location:</td>
				<td><form:hidden path="location" />${bus.getLocation()}</td>
			</tr>
			<tr>
				<td>Ticket Price:</td>
				<td><form:hidden path="ticket_price" />${bus.getTicket_price()}</td>
			</tr>

			<tr>
				<td><input type=button
					onClick="window.location.href='showbuses'"
					style="background-color: blue; color: yellow;" value="Cancel"></td>
				<td><input type=submit
					style="background-color: red; color: yellow;" value="Delete" /></td>
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