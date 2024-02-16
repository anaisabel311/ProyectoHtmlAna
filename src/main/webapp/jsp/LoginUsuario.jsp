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
<body>
    <form>
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" maxlength="20"><br><br>

        <label for="password">Contraseña:</label>
        <input type="password" id="password" name="password" maxlength="8" required><br><br>

        <button type="submit">Iniciar sesión</button>
    </form>
</body>   
    
<script>
        function validarRegistro() {
          // Obtener los valores de los campos
          var username = document.getElementById("username").value;
          var password = document.getElementById("password").value;
    
          // Restablecer estilos
          document.getElementById("nombre").classList.remove("error");
          document.getElementById("password").classList.remove("error");
    
          // Validar el nombre (por ejemplo, longitud mínima de 3 caracteres)
          if (username.length < 3) {
            alert("El usuario debe tener mínimo 3 caracteres");
            document.getElementById("username").classList.add("error");
            return;
        }
    
          // Validar la longitud mínima de la contraseña
          if (password.length < 8) {
            alert("La contraseña debe tener al menos 6 caracteres");
            document.getElementById("password").classList.add("error");
            return;
          }
    
          // Si todas las validaciones pasan, mostrar una alerta y redirigir
          alert("Registro exitoso");
          // Puedes redirigir a la página que desees cambiando la URL
          window.location.href = "IntroduccionUsuario.html";
        }
      </script>


</html>

