<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Búsqueda de productos</title>
<%@ include file="head.jsp" %>
</head>
<body>
	<div class="container py-4">
		<form action="SProcesoBusqueda">
			<table>
				<tr>
					<td>Ingrese el código</td>
					<td><input type="text" name="codigo"></td>
					<td><input type="submit" name="Buscar"></td>
				</tr>
			</table>
		</form>
	</div>
<%@ include file="foot.jsp" %>
</body>
</html>