import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class Firstservlet extends HttpServlet {
 private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firstservlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 /**
  * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  try {
   response.setContentType("text/html");
   PrintWriter out=response.getWriter();
   
   String n=request.getParameter("username");
   out.print("welcome "+n);
   
   //HttpSession session=request.getSession();
   //session.setAttribute("username",n);
   
   //out.println("<a href='SecondServlet'>visit</a>");
   out.println("<a href='SecondServlet?username="+n+"'>visit</a>");
   out.close();
   
   
  }catch(Exception e) {System.out.println(e);}
 }
 /**
  * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
  */
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub
  doGet(request, response);
 }
}