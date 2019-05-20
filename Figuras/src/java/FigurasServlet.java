/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Circulo;
import logica.Cuadrado;
import logica.Figura;

/**
 *
 * @author estudiantes
 */
@WebServlet(urlPatterns = {"/FigurasServlet"})
public class FigurasServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    static Figura Fig;
    public static void liskov(Figura F){
       F.calcularArea();
       F.calcularPerimetro();
       Fig=F;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        Cuadrado s= new Cuadrado();
        Circulo c= new Circulo();
        
        if(!"".equals(request.getParameter("radio")))
            c.setRadio(Integer.parseInt(request.getParameter("radio")));
        else c.setRadio(0);
        
        if(!"".equals(request.getParameter("base")))
            s.setBase(Integer.parseInt(request.getParameter("base")));
        else s.setBase(0);
        
        if(!"".equals(request.getParameter("altura")))
            s.setAltura(Integer.parseInt(request.getParameter("altura")));
        else s.setAltura(0);
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            liskov(c);
            out.println("<html>");
            out.println("<head>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
            out.println("<title>Servlet Figuras</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Figuras</h1>");
            out.println("<p>Area circulo: "+Fig.getArea()+"<br>Perimetro circulo:"+Fig.getPerimetro()+"</p>");
            liskov(s);
            out.println("<p>Area cuadrado: "+Fig.getArea()+"<br>Perimetro cuadrado:"+Fig.getPerimetro()+"</p>");
            out.println("<p><a href='index.html'>regresar</a></p>");
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
