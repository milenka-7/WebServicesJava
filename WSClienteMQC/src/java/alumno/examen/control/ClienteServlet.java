
package alumno.examen.control;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Milenka
 */
public class ClienteServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Gson gson=new Gson();
        String jsonString= gson.toJson(listarAlumno());
        response.setContentType("application/json");
        response.getWriter().write(jsonString);
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
        String nomAlumno= request.getParameter("nomAlumno");
        crearAlumno(nomAlumno);
        response.setContentType("text/plain");
        response.getWriter().write("Datos Ingresados");
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static String crearAlumno(java.lang.String nomAlumno) {
        alumno.examen.ws.AlumnoWebService_Service service = new alumno.examen.ws.AlumnoWebService_Service();
        alumno.examen.ws.AlumnoWebService port = service.getAlumnoWebServicePort();
        return port.crearAlumno(nomAlumno);
    }

    private static java.util.List<alumno.examen.ws.Alumno> listarAlumno() {
        alumno.examen.ws.AlumnoWebService_Service service = new alumno.examen.ws.AlumnoWebService_Service();
        alumno.examen.ws.AlumnoWebService port = service.getAlumnoWebServicePort();
        return port.listarAlumno();
    }

}
