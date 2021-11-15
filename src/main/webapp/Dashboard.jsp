<%-- 
    Document   : index
    Created on : 14/11/2021, 12:31:47 p. m.
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tarzam - Index</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/crud.css" rel="stylesheet" type="text/css"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="stylesheet" href="CSS/fontAwesome/all.css">
        <link rel="stylesheet" href="CSS/fontAwesome/all.min.css">
        <link href="/your-path-to-fontawesome/css/all.css" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;0,500;0,700;1,100;1,300;1,400&display=swap" rel="stylesheet">
    </head>
    <body>
        <header>
               <nav class="navbar">
                   <a href="/Tarzam/Dashboard"><img src="assets/logo2.png" alt="" class="navlogo"></a>
                   <ul>
                       <li>
                           <a href ="/Tarzam/Peliculas">Peliculas</a>
                       </li>
                       <form method="POST" action="Logout">
                           <input name="logut" type ="submit" value ="Salir" >
                           
                       </form>
                   </ul>
               </nav>
            </header>
        <% 
            //crea objeto de session y toma el ususario de la session
            HttpSession sessionJSP = request.getSession(); 
            String user = (String)sessionJSP.getAttribute("usuario");
        %>
        
        <h1>Bienvenido <%= user  %></h1>
        
    </body>
</html>
