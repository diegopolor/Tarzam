package com.mycompany.tarzam.s.a.s;

import Modelo.Objects.Pelicula;
import Modelo.Objects.PeliculaDAO;
import com.mycompany.tarzam.s.a.s.utils.Utils;
import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Camilo Ternera
 */
public class PeliculaController extends HttpServlet {

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
            PeliculaDAO pelicula = new PeliculaDAO();
            if(request.getMethod().equals("GET")){
                List<Modelo.Objects.Pelicula> peliculas = pelicula.selectPelicula();

                System.out.println(peliculas);
                request.setAttribute("peliculas", peliculas);
                Utils.loggedRedirect(request, response, "crudPelicula.jsp","/Tarzam/Login"); 
            } 
            else {
                if (request.getParameter("submit").equals("Agregar")) {
                    String titulo = request.getParameter("titulo_pelicula");
                    String tipo = request.getParameter("tipo_pelicula");
                    String categoria = request.getParameter("categoria_pelicula");
                    String actor = request.getParameter("actorprincipal_pelicula");
                    int precio = Integer.parseInt(request.getParameter("precioactual_pelicula"));
                    int stock = Integer.parseInt(request.getParameter("stock_pelicula"));
                    int saldo = Integer.parseInt(request.getParameter("saldo_pelicla"));
                    savePelicula(titulo, tipo, categoria, actor, precio, stock, saldo);
                }
            }
        }
    }

    private void savePelicula(String titulo, String tipo, String categoria, String actor, int precio, int stock, int saldo) {
        Pelicula pelicula = new Pelicula(titulo, tipo, categoria, actor, precio, stock, saldo);

        PeliculaDAO newPelicula = new PeliculaDAO();

        int insert = newPelicula.intertPelicula(pelicula);

        if(insert > 0) 
            out.println("<script>alert('Los datos ingresados se han GUARDADO satisfactoriamente'); window.location.href = '/Tarzam/Clientes'</script>");                                 
         else out.println("<script>alert('Error: Los datos ingresados son incorrectos, vuelvalo a intentar.'); window.location.href = '/Tarzam/Clientes'</script>"); 
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
