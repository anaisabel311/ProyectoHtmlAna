<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset='utf-8'>
<title>Insert title here</title>
<h1>FORMULARIO DE USUARIO </h1>
<body>
	<form action="/ProyectoWebFormulario/usuarioServlet" method="post" id= "FormUsu">
		<label id="NombreUsuario">Nombre: <input type="text" name="NombreUsuario"></label> <br><br>
		<label id="ApellidosUsuario">Apellidos: <input type="text" name="ApellidosUsuario"></label> <br><br>
		
		<%String username= (String)request.getAttribute("username");
		  String password= (String)request.getAttribute("password");	
		%>
		<label id="IdUsuario">IDUsuario:<%=username %></label> <br><br>
		<label id="password">Contraseña:<%=password %></label> <br><br>

<!-- 		<label id="Repassword" for="password2">ContraseÃ±a:</label>
		<input type="Repassword" name="password" id="password2"><br><br> -->
		
		<label id="EmailUsuario">Email: <input type="text" name="EmailUsuario"></label> <br><br>
		<label id="TelefonoUsuario">Telefono: <input type="text" name="TelefonoUsuario"></label> <br><br>
		<label id="FechaNaciemiento">Fecha Nacimiento: <input type="date" name="FechaNaciemiento"></label> <br>
		
		<label for="sexo">Seleccione Sexo</label><br>
    M <input type="radio" name="sexo" value="Masculino" tabindex="">
    F <input type="radio" name="sexo" value="Femenino" tabindex="">
    OTROS <input type="radio" name="sexo" value="Otros" checked tabindex=""><br>

		<label id="DniUsuario">DNI: <input type="text"name="DniUsuario"></label><br><br>

		<label id="SeleccionRol"><br>Selecciona el rol del usuario:<br></label> 
		<select id="seleccion" name="SeleccionRol" size="5" multiple>
			<option value="Usuario">Usuario</option>
			<option value="AdministradorSr">AdministradorSr</option>
			<option value="ProgramadorSr">ProgramadorSr</option>
			<option value="AdministradorJr">AdministradorJr</option>
			<option value="ProgramadorJr">ProgramadorJr</option>
			
		</select><br> <br>


		<br> <input id="enviar_usuario" type="submit" value="Dar de Alta">
	</form>
</body>
</html>