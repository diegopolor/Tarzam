/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarzam.s.a.s;

import Modelo.Objects.LoginDao;
import Modelo.conexion.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            /* Peticion GET */
            if(request.getMethod().equals("GET")){
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }  
            /* Petición POST */
            else if(request.getMethod().equals("POST")){
                
                //toma los datos enviados en la petición
                String usuario = request.getParameter("usuario");
                String clave = request.getParameter("clave");
                
                //instancia la clase Login para la consulta
                LoginDao login =  new LoginDao();
                System.out.println("asdsdas");
                Conexion.getConnection();
                /*/se le pasa el usario y la clave para verificar que existe, devulve un booleano
                if(login.checkLogin(usuario, clave)){
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
                else {
                    //si es false devuelve al front un atributo resultado 
                    request.setAttribute("resultados", "Usuario o contraseña incorrecta");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                } 
               */ 
                
                
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
