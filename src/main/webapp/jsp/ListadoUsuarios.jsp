<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="servlets.UsuarioServlet, Pojos.UsuarioTabla, Pojos.RolTabla, java.util.List, java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
	table, td, th { border:1px solid black; }
	#table { border-spacing:10px; }
	#table { border-collapse:collapse; }
	#td { padding:10px; }
	#td, th { padding:5px; }
	table { width:100%; }
	thead { color:navy; } 
	tbody { color:green; } 
	tfoot { color:maroon; }
</style>
<body>
<table>
		<caption><%=request.getAttribute("subtitle") %></caption>
		
<!--<form action="UsuarioServlet" method="post">  -->
	
<% Map<String,UsuarioTabla> mapa = (Map<String,UsuarioTabla>)request.getAttribute("mapa");	
	List<UsuarioTabla> usuarios = (List<UsuarioTabla>)mapa.get("listadoUsuarios");%>		
<!-- // hay que castear el objeto "listadoUsuarios", ya que en el setAttribute te manda un objeto. -->		
	
	<h1><%=mapa.get("subtitulo") %></h1>
<tr>
			<th>NOMBRE USUARIO</th>
			<th>APELLIDOS </th>
			<th>PASSWORD</th>
			<th>ID USUARIO</th>
			<th>EMAIL</th>
			<th>TELEFONO</th>
			<th>FECHA ALTA</th>
			<th>SEXO</th>
			<th>DNI</th>
			<th>ROLES</th>
		</tr>
</table>
</body>
</html>