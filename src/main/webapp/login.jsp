<%-- 
    Document   : index
    Created on : 13/11/2021, 5:08:54 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarzam</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,700;1,100;1,300;1,400&display=swap" rel="stylesheet">
    </head>
    <body>
        <main class="container">
            <div class="form-container">
                <div class="logocontainer">
                    <img src="assets/loginlogo.jpg" alt="" class="formimg"/>
                </div>
                <form action="Login" method = "POST" class="form">
                    <h2 class="formtxt">INICIAR SESIÓN AQUÍ</h2>
                    <label for="" class="formtxt formlabel">Usuario</label>
                    <input type="text" name="usuario" placeholder="Introducir usuario" class="forminput">
                    <label for="" class="formtxt formlabel">Contraseña</label>
                    <input type="password" name="clave" placeholder="Introducir contraseña" class="forminput">
                    
                    <%-- Renderizado condicional, renderiza el texto de error si este es devuelto por el servlet --%>
                    <% 
                        //recibe el atributo resultado devuelto por el servlet
                        String result = (String)request.getAttribute("resultados");
                    %>
                    <p style = "color:red;"><%= result != null ? result : "" %></p>
                    
                    <button type="submit" class="formbtn">Iniciar sesión</button>

                </form>
            </div>

        </main>
    </body>
</html>
