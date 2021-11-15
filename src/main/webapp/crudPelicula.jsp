<%-- 
    Document   : crudPelicula
    Created on : 14/11/2021, 7:48:22 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tarzam</title>
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
                    <table class="table">
                        <thead>
                            <tr>
                                <th>id</th>
                                <th>title</th>
                                <th>type</th>
                                <th>category</th>
                                <th>cast</th>
                                <th>price</th>
                                <th>stock</th>
                                <th>balance</th>
                                <th>options</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Venom</td>
                                <td>Action</td>
                                <td>Superheroe</td>
                                <td>Tom hardy</td>
                                <td>0.00</td>
                                <td>50</td>
                                <td>0</td>
                                <td class="tablebtn">
                                    <button class="btn1">Edit</button>
                                    <button class="btn2">Delete</button>
                                </td>
                            </tr>
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
