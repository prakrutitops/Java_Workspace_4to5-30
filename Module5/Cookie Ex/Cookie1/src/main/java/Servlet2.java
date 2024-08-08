import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Servlet2")
@MultipartConfig(maxFileSize=16177216)
public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		Cookie c[] = req.getCookies();
		
		
		boolean f = false;
		String name="";
		
		if (c==null) 
		{
			out.println("<a>Firsr enter your name</a>");
			return;
		}
		else
		{
			for(Cookie ck:c)
			{
				String nme = ck.getName();
				if(nme.equals("uname"))
				{
					f = true;
					name=ck.getValue();
				}
			}
		}
		
		if (f) 
		{
			out.println("<a>" + name + " welcome back to website " +  "</a>");
			out.println("<a href='logout'>logout </a>");
		}
		else
		{
			out.println("<a>Firsr enter your name</a>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
		
	}
	
	

}
