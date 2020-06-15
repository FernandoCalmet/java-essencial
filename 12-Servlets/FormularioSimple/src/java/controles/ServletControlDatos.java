/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ferca
 */
@WebServlet(name = "ServletControlDatos", urlPatterns = {"/ServletControlDatos"})
public class ServletControlDatos extends HttpServlet {

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
        
        /* Capturar datos del formulario */
        String nombre = request.getParameter("inputNombre");
        String apellido_paterno = request.getParameter("inputApellidoPaterno");
        String apellido_materno = request.getParameter("inputApellidoMaterno");
        String correo = request.getParameter("inputCorreo");
        String clave = request.getParameter("inputClave");
        String comentario = request.getParameter("inputComentario");
        String interes = request.getParameter("inputInteres");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletControlDatos</title>");            
            out.println("</head>");
            out.println("<body>");       
            if (nombre.compareTo("Fernando") == 0) {
                out.println("<h2>Hola </h2><h1>" + nombre + " " + apellido_paterno + " " + apellido_materno + "</h1>");
                out.println("<p>Correo: " + correo + "</p>");
                out.println("<p>Clave: " + clave + "</p>");
                out.println("<p>Comentario: " + comentario + "</p>");
                out.println("<p>Area de interes: " + interes + "</p>");
            } else {
                response.sendRedirect("desconocido.html");
            }    
            out.println("</body>");
            out.println("</html>");
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
