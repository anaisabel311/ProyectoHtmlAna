<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8">
    <title>FORMULARIO DE USUARIO</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>
<header class="bg-dark text-white py-3">
    <div class="container">
       <h1>FORMULARIO DE USUARIO</h1>
    </div>
</header>
<div class="container mt-5">
    

    <form action="/ProyectoWebFormulario/UsuarioServlet" method="post" id="FormUsu">
        <div class="form-group">
            <label for="NombreUsuario">Nombre:</label>
            <input type="text" class="form-control" name="NombreUsuario">
        </div>

        <div class="form-group">
            <label for="ApellidosUsuario">Apellidos:</label>
            <input type="text" class="form-control" name="ApellidosUsuario">
        </div>

        <div class="form-group">
            <label for="IdUsuario">IDUsuario:</label>
            <input type="text" class="form-control" name="IdUsuario">
        </div>

        <div class="form-group">
            <label for="Password">Contraseña:</label>
            <input type="text" class="form-control" name="passUsuario">
        </div>

        <div class="form-group">
            <label for="EmailUsuario">Email:</label>
            <input type="text" class="form-control" name="EmailUsuario">
        </div>

        <div class="form-group">
            <label for="TelefonoUsuario">Telefono:</label>
            <input type="text" class="form-control" name="TelefonoUsuario">
        </div>

        <div class="form-group">
            <label for="FechaNaciemiento">Fecha Nacimiento:</label>
            <input type="date" class="form-control" name="FechaNaciemiento">
        </div>

        <div class="form-group">
            <label for="sexo">Seleccione Sexo:</label><br>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="sexo" value="Masculino" checked>
                <label class="form-check-label" for="sexo">M</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="sexo" value="Femenino">
                <label class="form-check-label" for="sexo">F</label>
            </div>
            <div class="form-check form-check-inline">
                <input type="radio" class="form-check-input" name="sexo" value="Otros">
                <label class="form-check-label" for="sexo">OTROS</label>
            </div>
        </div>

        <div class="form-group">
            <label for="DniUsuario">DNI:</label>
            <input type="text" class="form-control" name="DniUsuario">
        </div>

        <div class="form-group">
            <label for="SeleccionRol">Selecciona el rol del usuario:</label>
            <select id="seleccion" name="SeleccionRol" class="form-control" size="5" multiple>
                <option value="Usuario">Usuario</option>
                <option value="AdministradorSr">AdministradorSr</option>
                <option value="ProgramadorSr">ProgramadorSr</option>
                <option value="AdministradorJr">AdministradorJr</option>
                <option value="ProgramadorJr">ProgramadorJr</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">Dar de Alta</button>
    </form>
</div>
<footer class="text-center mt-5">
    <p>Ana. 2024</p>
</footer>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
