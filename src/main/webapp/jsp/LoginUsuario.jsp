<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="../validacionesjs/validacionLogin.js"></script>
</head>
<body>
<header class="bg-dark text-white py-3">
    <div class="container">
       <h1>Alta usuario</h1>
    </div>
</header>
<div class="container mt-5">
    <form action="/ProyectoWebFormulario/LoginServlet" onsubmit="return validarLogin()">
        <div class="form-group">
            <label for="username">Usuario:</label>
            <input type="text" class="form-control" id="username" name="username" maxlength="20">
        </div>

        <div class="form-group">
            <label for="password">Contraseña:</label>
            <input type="password" class="form-control" id="password" name="password" maxlength="8" required>
        </div>

        <button type="submit" class="btn btn-primary">Iniciar sesión</button>
    </form>

    <a href="/ProyectoWebFormulario/jsp/FormUsuario.jsp" class="btn btn-success mt-3">Crear Usuario</a>
</div>
<footer class="text-center mt-5">
    <p>Ana. 2024</p>
</footer>

</body>
</html>
