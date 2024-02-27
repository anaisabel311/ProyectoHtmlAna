
        function validarLogin() {
		alert("dentro del .js");	
          // Validar la longitud mínima del Usuario
          var username = document.getElementById("username").value;
          alert(username);
              
          if (username.length < 4) {
                alert('La contraseña debe tener entre 4 y 8 caracteres.');
                document.getElementById("username").classList.add("error");
                return false; 
           }else{
             	alert("Login Correcto");
    	  // Validar la longitud mínima de la contraseña
          		var password = document.getElementById("password").value;
          			if (password.length < 6) {
            				alert("La contraseña debe tener al menos 6 caracteres");
            				document.getElementById("password").classList.add("error");
            				return false;
          			}else {
    
          	// Si todas las validaciones pasan, mostrar una alerta y redirigir al jsp
          alert("Login Correcto");
          
          return true
        }
}
}
/**
 * 
 */