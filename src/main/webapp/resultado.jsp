<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de b�squeda</title>
</head>
<body>
	<h1>B�squeda exitosa</h1>
	<jsp:useBean id="dato" type="modelo.ProductoBean" scope="request"/>
	<jsp:getProperty property="codigo" name="dato"/>
	<jsp:getProperty property="nombre" name="dato"/>
	<jsp:getProperty property="precio" name="dato"/>
	<jsp:getProperty property="stock" name="dato"/>
	<a href="busqueda.jsp">Nueva b�squeda</a>
</body>
</html>