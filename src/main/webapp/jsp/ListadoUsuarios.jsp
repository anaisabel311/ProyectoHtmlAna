<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="servlets.usuarioServlet, Pojos.UsuarioTabla, Pojos.RolTabla, java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
		<caption>LISTADO DE USUARIOS</caption>
		<tr>
			<th>NOMBRE USUARIO</th>
			<th>APELLIDOS </th>
			<th>SEXO</th>
			<th>ASIGNATURA FAVORITA</th>
			<th>DESCRIPCIÓN</th>
			
		</tr>

<form action="UsuarioServlet" method="post">		
<% List<UsuarioTabla> usuarios = (List<UsuarioTabla>)request.getAttribute("listadoUsuarios");%>		
<!-- // hay que castear el objeto "listadoUsuarios", ya que en el setAttribute te manda un objeto. -->		
		

</body>
</html>