<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>
</head>

<script type="text/javascript" src="../validacionesjs/validacionLogin.js"></script>
<body>
    <form action="/ProyectoWebFormulario/LoginServlet" onsubmit= "return validarLogin()" >
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" maxlength="20"><br><br>
        

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" maxlength="8" required><br><br>

        <button type="submit" >Iniciar sesión</button>
    </form>
</body>   
    

</html>

