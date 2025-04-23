<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<h1 style="text-align: center">Buses</h1>

<style>
table, th, td {
	border: 1px solid black;
	padding: 5px
}

table.center {
	margin-left: auto;
	margin-right: auto;
}
</style>

<table class="center" style="width: 50%;">
	<tr>
		<th>Bus Name</th>
		<th>Bus Location</th>
		<th>Bus Price</th>
	</tr>

	<c:forEach var="bus" items="${buses}">
		<tr>
			<td>${bus.bus_name}</td>
			<td>${bus.location}</td>
			<td>${bus.ticket_price}</td>
			<td><input type=button
				onClick="location.href='editbus?bus_id=${bus.bus_id}'"
				style="background-color: blue; color: yellow;" value='Edit'></td>
			<td><input type=button
				onClick="location.href='deletebus?bus_id=${bus.bus_id}'"
				style="background-color: red; color: yellow;" value='Delete'></td>
		</tr>

	</c:forEach>

</table>

<h2 style="text-align: left">Search by location</h2>
<form action="/busOperator/showbuses" method="get">
	<input type="text" name="location" placeholder="Enter location">
	<button type="submit">Search</button>
</form>

<br>
<br>

<a href="/busOperator/addbus">
	<button type="button"
		style="background-color: yellow; color: blue; width: 150p x; height: 40px;">
		Add Bus</button>
</a>

<br>
<br>

<a href="/busOperator/"
	style="display: block; text-align: left; margin-top: 20px;">Go to
	Home</a>

