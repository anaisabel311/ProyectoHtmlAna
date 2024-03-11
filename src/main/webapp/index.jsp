<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ResourceBundle" %>
<%@ page import="java.util.Locale" %>
<%@ page import="java.io.*" %>
<%
    ResourceBundle rb = ResourceBundle.getBundle("cabecera", Locale.getDefault(), Thread.currentThread().getContextClassLoader());
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title><%= rb.getString("title") %></title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="bg-light">

<header class="bg-dark text-white py-3">
    <div class="container">
        <h1><%= rb.getString("titulo.pag") %></h1>
    </div>
</header>

<div class="container mt-5">
    
    <a href="/ProyectoWebFormulario/jsp/LoginUsuario.jsp" class="btn btn-primary" target="_blank">Página Acceso Usuario</a>
</div>

<footer class="text-center mt-5">
    <p>Ana. 2024</p>
</footer>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>
</html>
