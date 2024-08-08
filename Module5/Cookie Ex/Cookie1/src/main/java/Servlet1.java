import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet1")
@MultipartConfig(maxFileSize=16177216)
public class Servlet1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out  = resp.getWriter();
		
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			
			String name = req.getParameter("name") ;
			
			Cookie c = new Cookie("uname", name);	
			resp.addCookie(c);
			
			
			if (name==null)
			{
				out.println("<a>Firsr enter your name</a>");
				return;
			}
			else
			{
				out.println("<a>" + name + " welcome to website " +  "</a>");
				out.println("<a href='Servlet2'>go to servlet 2 </a>");
			}
			
			
			out.println("</body>");
			out.println("</html>");
			
	}
}
