
package com.mycompany.tarzam.s.a.s.utils;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Utils {
    
    
    /*
    loggedRedirect : Redirecciona al usuario si no está logueado (Se usa para redireccionar en rutas publicas como Login)
    Parametros:
        request : Objeto request del servlet.
        response: Objeto response del servelt.
        redirectLogged: donde se va a redireccionar si esta logueado.
        redirectNoLogged: donde se va a redireccionar si no está logueado.   
    */  
    public static void noLoggedRedirect(HttpServletRequest request,HttpServletResponse response, String redirectLogged, String redirectNoLogged)
            throws ServletException, IOException{
        
                //toma la cookie de isLogged
                HttpSession session = request.getSession(); 
                //si existe la cookie la almacena, si no le asigna false a isLogged
                Boolean isLogged = (Boolean)session.getAttribute("isLogged") != null ? (Boolean)session.getAttribute("isLogged") : false;
                //verifca si esta logueado y lo redirecciona
                if(isLogged)response.sendRedirect(redirectLogged);
                else request.getRequestDispatcher(redirectNoLogged).forward(request, response);
    }
    
        /*
        loggedRedirect : Redirecciona al usuario si está logueado (Se usa para rutas privadas que requieren estar logueados)
        Parametros:
            request : Objeto request del servlet.
            response: Objeto response del servelt.
            redirectLogged: donde se va a redireccionar si esta logueado.
            redirectNoLogged: donde se va a redireccionar si no está logueado.
    
    */ 
    public static void loggedRedirect(HttpServletRequest request,HttpServletResponse response, String redirectLogged, String redirectNoLogged)
        throws ServletException, IOException{
        
            //toma la cookie de isLogged.
            HttpSession session = request.getSession(); 
            //si existe la cookie la almacena, si no le asigna false a isLogged
            Boolean isLogged = (Boolean)session.getAttribute("isLogged") != null ? (Boolean)session.getAttribute("isLogged") : false;
            //verifca si esta logueado y lo redirecciona
            if(isLogged) request.getRequestDispatcher(redirectLogged).forward(request, response);
            else response.sendRedirect(redirectNoLogged);
            
    }
    
}
