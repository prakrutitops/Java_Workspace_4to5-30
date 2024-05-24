import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class MyFilter implements Filter
{

	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub
		System.out.println("DESTROY Called");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException 
	{
		// TODO Auto-generated method stub
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
	
		String name = arg0.getParameter("name");
		String surname = arg0.getParameter("surname");
		String email = arg0.getParameter("email");
		String pass = arg0.getParameter("pass");
		
		if(name.equalsIgnoreCase("")||surname.equalsIgnoreCase("")||email.equalsIgnoreCase("")||pass.equalsIgnoreCase(""))
		{
			
			out.println("All feilds are mandetary");
			arg0.getRequestDispatcher("index.html").include(arg0,arg1);
		}
		else if(name.equalsIgnoreCase(null)||surname.equalsIgnoreCase(null)||email.equalsIgnoreCase(null)||pass.equalsIgnoreCase(null))
		{
			
			out.println("Feilds are not  getting value ");
			arg0.getRequestDispatcher("index.jsp").include(arg0,arg1);
		}
		else if(pass.equals("admin")) 
		{
			arg2.doFilter(arg0,arg1);
			
		}
		
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("INIT Called");
	}

}
