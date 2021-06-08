 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Register</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Register at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
       response.getWriter().append("Servlet at:").append(request.getContextPath());
    }   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String orderid=request.getParameter("orderid");
            String ordername=request.getParameter("ordername");
            String bags=request.getParameter("bags");
            String date=request.getParameter("date");
            String vnumber=request.getParameter("vnumber");
            String dname= request.getParameter("dname");
            incomingGETSET member=new incomingGETSET(orderid,ordername,bags,date,vnumber,dname);
            incomingDao inDao=new incomingDao();
            String result ="saved";
        try {
            result =inDao.insert(member);
        } catch (SQLException ex) {
             ex.printStackTrace();
        }
        response.getWriter().print(result);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
