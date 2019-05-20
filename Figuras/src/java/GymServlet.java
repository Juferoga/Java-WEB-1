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
import logica.Usuario;
import logica.Rutina;
import logica.FichaMedica;
import logica.Dieta;
import logica.Persona;

/**
 *
 * @author Juan Felipe (Local)
 */
@WebServlet(urlPatterns = {"/GymServlet"})
public class GymServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    static Usuario Usr;
    public static void liskov(Usuario U){
        
        U.CalcularIMC();
        U.ResIMC();
        U.Rutine();
        U.Dieta();
        
        Usr=U;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        Usuario u=new Usuario();
        Persona p=new Persona();
        FichaMedica FM=new FichaMedica();
        Dieta D=new Dieta();
        Rutina R=new Rutina();
        
        //DATOS PERSONA
        
        if(!"".equals(request.getParameter("Nombre")))
            p.setNombre(request.getParameter("Nombre"));
        else p.setNombre("Anonimus :)");
        
        if(!"".equals(request.getParameter("sexo")))
            p.setSex(request.getParameter("sexo"));
        else p.setSex("Hombre");
        
        if(!"".equals(request.getParameter("cc")))
            p.setCedula(Integer.parseInt(request.getParameter("cc")));
        else p.setCedula(123123);
        
        if(!"".equals(request.getParameter("tel")))
            p.setTelefono(Integer.parseInt(request.getParameter("tel")));
        else p.setTelefono(123123);
        
        //DATOS FICHA MEDICA
        
        if(!"".equals(request.getParameter("Edad")))
            FM.setEdad(Integer.parseInt(request.getParameter("Edad")));
        else FM.setEdad(18);
        
        if(!"".equals(request.getParameter("Rehab")))
            FM.setCond_Esp(request.getParameter("Rehab"));
        else FM.setCond_Esp("NA");
        
        if(!"".equals(request.getParameter("Peso")))
            FM.setPeso(Double.parseDouble(request.getParameter("Peso")));
        else FM.setPeso(60);
        
        if(!"".equals(request.getParameter("Talla")))
            FM.setTalla(Double.parseDouble(request.getParameter("Talla")));
        else FM.setTalla(60);
        
        
        
        // DATOS DIETA
        
        //aqui no recibe datos XD        
        
        //DATOS RUTINA
        
        //aqui tampoco recibe datos XD
        double r;
        liskov(u);
        r = FM.getPeso()*(FM.getTalla()*FM.getTalla());
        FM.CalcularIMC();
        FM.getRESIMC();
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GymServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Gymnasio El Gimnasio</h1>");
            out.println("<p>El Usuario Con nombre: "+p.getNombre()+"<br>cedula:"+p.getCedula()+"<br> sexo :"+p.getSex()+" telefono: "+p.getTelefono()+"<br><hr><h1>Ficha medica</h1><br> Edad:"+FM.getEdad()+"<br> Peso:"+FM.getPeso()+"<br>Talla:"+FM.getTalla()+"<br>Condicion especial:"+FM.getCond_Esp() +" </p>");
            out.println("<h1>Gymnasio El Gimnasio</h1><br>"+r+"<br>Dieta["+Usr.getDieta()+"]<br>Rutina["+Usr.getRUTA()+"]");
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
