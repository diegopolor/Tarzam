<%-- 
    Document   : crudPelicula
    Created on : 14/11/2021, 7:48:22 p. m.
    Author     : User
--%>

<%@page import="Modelo.Objects.Pelicula"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tarzam - Peliculas</title>
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
        <main class="container">
           <header>
               <nav class="navbar">
                   <a href="/Tarzam/Dashboard"><img src="assets/logo2.png" alt="" class="navlogo"></a>
                   <ul>
                       <li>
                           <a href ="/Tarzam/Peliculas">Peliculas</a>
                           <a href ="/Tarzam/Clientes">Clientes</a>
                       </li>
                       <form method="POST" action="Logout">
                           <input name="logut" type ="submit" value ="Salir" >                     
                       </form>
                   </ul>
               </nav>
            </header>
            <div class="content">
                <div class="TableContainer">
                    <h1>Listado de Peliculas</h1>
                    <a href="formPelicula.jsp">+Agregar</a>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Titulo</th>
                                <th>Tipo</th>
                                <th>Categoria</th>
                                <th>Cast</th>
                                <th>Precio</th>
                                <th>Stock</th>
                                <th>Saldo</th>
                                <th>options</th>
                            </tr>
                        </thead>
                        <tbody>
                               <%                      
                                List<Pelicula>peliculas = (List<Pelicula>)request.getAttribute("peliculas");
                                
                                System.out.println("-------Dats----------");
                                System.out.println(peliculas);
                                
                                for(Pelicula peli : peliculas){                         
                                %>
                            <tr>
                                <td><%=peli.getId_pelicula() %></td>
                                <td><%=peli.getTitulo() %></td>
                                <td><%=peli.getTipo()%></td>
                                <td><%=peli.getCategoria() %></td>
                                <td><%=peli.getActorPrincipal()%></td>
                                <td><%=peli.getPrecio()%></td>
                                <td><%=peli.getStock()%></td>
                                <td><%=peli.getSaldo()%></td>
                                <td class="tablebtn">
                                    <button class="btn1">Edit</button>
                                    <button class="btn2">Delete</button>
                                </td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                </div>
                <footer>
                   <a href="#"><img src="assets/logo1.png" alt="" class="navlogo"></a>
                </footer>
            </div>
        </main>
    </body>
</html>
