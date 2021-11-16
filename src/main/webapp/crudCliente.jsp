<%-- 
    Document   : crudCliente
    Created on : 14/11/2021, 9:14:17 p. m.
    Author     : User
--%>

<%@page import="Modelo.Objects.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tarzam - Clientes</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/formcrud.css" rel="stylesheet" type="text/css"/>
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
                            <a href ="/Tarzam/Peliculas" class="navbtn">Peliculas</a>
                            <a href ="/Tarzam/Clientes" class="navbtn">Clientes</a>
                       </li>
                       <form method="POST" action="Logout">
                           <input name="logut" type ="submit" value ="Salir"  class="logutbtn navbtn">                                                                                                                                                                       
                       </form>
                   </ul>              
               </nav>
            </header>
            <div class="content">
                <div class="TableContainer">
                    <h1>Listado de Clientes</h1>
                    <button class="addbtn">Agregar</button>
                    <table class="table">
                        <thead>
                            <tr>
                                <th>Documento</th>
                                <th>Nombre</th>
                                <th>Apellidos</th>
                                <th>Dirección</th>
                                <th>Celular</th>
                                <th>Telefono</th>
                                <th>options</th>
                            </tr>
                        </thead>
                        <tbody>
                                <%        
                                 
                                List<Cliente>clientes  = (List<Cliente>)request.getAttribute("clientes");
                                
                                System.out.println("-------Dats----------");
                                System.out.println(clientes.size());
                                
                                for(Cliente clie : clientes){                         
                                %>
                            <tr>
                                <td><%=clie.getDocumento() %></td>
                                <td><%=clie.getNombre() %></td>
                                <td><%=clie.getApellidos() %></td>
                                <td><%=clie.getDireccion()%></td>
                                <td><%=clie.getTelefono() %></td>
                                <td><%=clie.getCelular() %></td>
                                <td class="tablebtn">
                                    <button accesskey = "<%=clie.getDocumento() %>" class="editarBtn btn1">Edit</button>
                                    <button class="btn2">Delete</button>
                                </td>
                            </tr>
                            <% } %>
                        </tbody>
                    </table>
                </div>
                <div class="form-container">
                    <div class="logoutcontainer">
                        <button class="exitbtn">X</button>
                    </div>
                    <form action="Clientes" method = "POST" class="form">
                        <div class="form-subcontainer">
                            <label for="" class="formtxt formlabel">Documento</label>
                            <input type="number" name="documento"  class="forminput">
                            <label for="" class="formtxt formlabel">Nombre</label>
                            <input type="text" name="nombre" class="forminput">
                            <label for="" class="formtxt formlabel">Apellidos</label>
                            <input type="text" name="apellidos" class="forminput">
                            <label for="" class="formtxt formlabel">Dirección</label>
                            <input type="text" name="direccion"  class="forminput">
                            <label for="" class="formtxt formlabel">Celular</label>
                            <input type="number" name="celular"  class="forminput">
                            <label for="" class="formtxt formlabel">Telefono</label>
                            <input type="number" name="telefono"  class="forminput">
                            <button type="submit" class="formbtn">Agregar</button>
                        </div>
                      
                    </form>
                </div>
                <footer>
                   <a href="#"><img src="assets/logo1.png" alt="" class="navlogo"></a>
                </footer>
            </div>
        </main>
    </body>
    <script src="JS/crud.js"></script>

</html>
