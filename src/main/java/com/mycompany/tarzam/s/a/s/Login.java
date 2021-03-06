
package com.mycompany.tarzam.s.a.s;

import Modelo.Objects.LoginDao;
import com.mycompany.tarzam.s.a.s.utils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;



public class Login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            /* Peticion GET */
            if(request.getMethod().equals("GET")){   
                //redirecciona si el usuario esta loggueado o no
                Utils.noLoggedRedirect(request, response, "/Tarzam/Dashboard","login.jsp");              
            }  
            /* Petición POST */
            else if(request.getMethod().equals("POST")){
                
                //toma los datos enviados en la petición
                String usuario = request.getParameter("usuario");
                String clave = request.getParameter("clave");
                
                //instancia la clase Login para la consulta
                LoginDao login =  new LoginDao();
         
                //se le pasa el usuario y la clave, esto devuelve un booleano
                if(login.checkLogin(usuario, clave)){
                    //crea una sesión
                    HttpSession session = request.getSession(true);
                    //crea las cookies para la sesión 
                    session.setAttribute("usuario", usuario);
                    session.setAttribute("isLogged", true); 
                    //redirecciona al dashboard
                    response.sendRedirect("/Tarzam/Dashboard");
                }
                else {
                    //si es false devuelve al front un atributo resultado y renderiza el login.jsp
                    request.setAttribute("resultados", "Usuario o contraseña incorrecta");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }                     
           } 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
