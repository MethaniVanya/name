import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* Servlet implementation class MyServlet1
*/
@WebServlet("/MyServlet1")
public class MyServlet1 extends HttpServlet {
private static final long serialVersionUID = 1L;
      
   /**
    * @see HttpServlet#HttpServlet()
    */
   public MyServlet1() {
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
PrintWriter pwriter=response.getWriter();
String name=request.getParameter("username");
String password=request.getParameter("userPassword");
pwriter.print("Hello"+name); 
pwriter.print("your password is:"+password);
Cookie c1=new Cookie("username",name);
Cookie c2=new Cookie("userPassword",password);
response.addCookie(c1);
response.addCookie(c2);
pwriter.close();

}catch(Exception exp) {
System.out.println(exp);

}
}

/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
}

}