<%-- 
    Document   : formUser
    Created on : 15/11/2021, 2:21:33 p. m.
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tarzam</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/form.css" rel="stylesheet" type="text/css"/>
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
                       </li>
                   </ul>
               </nav>
            </header>
            <div class="content">
                <div class="TableContainer">
                    <div class="form-container">
                        <div class="logoutcontainer">
                            <button class="exitbtn">X</button>
                        </div>
                        <form action="" method = "POST" class="form">
                            <div class="form-subcontainer">
                                <label for="" class="formtxt formlabel">Username</label>
                                <input type="text" name="" class="forminput">
                                <label for="" class="formtxt formlabel">Password</label>
                                <input type="password" name="" class="forminput">
                                <button type="submit" class="formbtn">Agregar</button>
                            </div>
                          
                        </form>
                    </div>
                </div>
                <footer>
                   <a href="#"><img src="assets/logo1.png" alt="" class="navlogo"></a>
                </footer>
            </div>
        </main>
    </body>
</html>
