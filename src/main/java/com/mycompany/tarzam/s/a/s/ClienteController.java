package com.mycompany.tarzam.s.a.s;

import Modelo.Objects.Cliente;
import Modelo.Objects.ClienteDAO;
import com.mycompany.tarzam.s.a.s.utils.Utils;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            if(request.getMethod().equals("GET")){
                //crea la instancia de clientesDAO
                ClienteDAO clientesDao = new ClienteDAO();
                //hace la petición a la base de datos y devuelve los datos
                List<Modelo.Objects.Cliente> clientes = clientesDao.selectCliente(); 
                //pasa los datos de la consulta al front end
                request.setAttribute("clientes", clientes);
                System.out.println("obtuvo get");
                Utils.loggedRedirect(request, response, "crudCliente.jsp","/Tarzam/Login"); 
            }
            else if(request.getMethod().equals("POST")){
                
                //AGREGAR        
                    if(request.getParameter("submit").equals("Agregar")){
                        try {

                            String nombre = request.getParameter("nombre");
                            String apellidos = request.getParameter("apellidos");
                            int documento = Integer.parseInt(request.getParameter("documento")); 
                            String direccion = request.getParameter("direccion");
                            String telefono = request.getParameter("telefono");
                            String celular = request.getParameter("celular");
                            
                            Cliente cliente = new Cliente(nombre,  apellidos,  documento,  direccion,  telefono,  celular);
                
                            ClienteDAO clienteDao = new ClienteDAO();
                            int insert = clienteDao.insertCliente(cliente);
                
                            if(insert > 0)
                                out.println("<script>alert('Los datos ingresados se han GUARDADO satisfactoriamente'); window.location.href = '/Tarzam/Clientes'</script>");                                 
                            else out.println("<script>alert('Error: Los datos ingresados son incorrectos, vuelvalo a intentar.'); window.location.href = '/Tarzam/Clientes'</script>");                                 
                        }catch(NumberFormatException  e){
                            out.println("<script>alert('Error: Los datos ingresados son incorrectos, vuelvalo a intentar.'); window.location.href = '/Tarzam/Clientes'</script>");                           
                        }                                       
                    }
                    else if(request.getParameter("submit").equals("Actualizar")){
                        try{
                            int id = Integer.parseInt(request.getParameter("id")); 
                            String nombre = request.getParameter("nombre");
                            String apellidos = request.getParameter("apellidos");
                            int documento = Integer.parseInt(request.getParameter("documento")); 
                            String direccion = request.getParameter("direccion");
                            String telefono = request.getParameter("telefono");
                            String celular = request.getParameter("celular");
                
                            Cliente cliente = new Cliente(id, nombre,  apellidos,  documento,  direccion,  telefono,  celular);
                
                            ClienteDAO clienteDao = new ClienteDAO();
                            int insert = clienteDao.updateCliente(cliente);
                
                            if(insert > 0){
                                out.println("<script>alert('Los datos ingresados se han ACTUALIZADO satisfactoriamente'); window.location.href = '/Tarzam/Clientes'</script>");
                            }
                            else out.println("<script>alert('Error: Los datos ingresados son incorrectos, vuelvalo a intentar.'); window.location.href = '/Tarzam/Clientes'</script>");                                        
                        }catch(NumberFormatException e){
                            out.println("<script>alert('Error: Los datos ingresados son incorrectos, vuelvalo a intentar.'); window.location.href = '/Tarzam/Clientes'</script>");                                        
                        }
                    }
                    else if(request.getParameter("submit").equals("Eliminar")){
                        int id = Integer.parseInt(request.getParameter("id")); 
                        Cliente cliente = new Cliente(id);
                        ClienteDAO clienteDao = new ClienteDAO();
                        int delete =clienteDao.DeleteCliente(cliente);
                        
                        if(delete > 0)
                             out.println("<script>alert('Los datos se han ELIMINADO satisfactoriamente'); window.location.href = '/Tarzam/Clientes'</script>");
                        else  out.println("<script>alert('Los datos no se han podido eliminar.'); window.location.href = '/Tarzam/Clientes'</script>");
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
