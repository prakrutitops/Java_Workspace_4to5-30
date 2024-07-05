import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.a.SignupModel;




@WebServlet("/Loginprocess")
public class  Loginprocess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
	
		SignupModel m2=null;
		Connection con = null;	
		String usl = "jdbc:mysql://localhost:3306/form";
		String user = "root";
		String pass1 = "";
		
		try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass1);
				PreparedStatement ps = con.prepareStatement("select * from usertable where email=? and password=?");
				ps.setString(1,email);
				ps.setString(2,pass);
				
				ResultSet set = ps.executeQuery();
				
				while(set.next())
				{
					int id = set.getInt(1);
					String fname = set.getString(2);
					String lname = set.getString(3);
					String email1 = set.getString(4);
					String password = set.getString(5);
					
					m2 = new SignupModel();
					
					m2.setId(id);
					m2.setFname(fname);
					m2.setLname(lname);
					m2.setEmail(email1);
					m2.setPassword(password);
					
					HttpSession sess = null;
					sess.setAttribute("a", sess);
					
					if(m2!=null)
					{
						System.out.println("success");
						response.sendRedirect("profile.jsp");
						
						
//						RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
//						request.setAttribute("id",m2.getId());
//						rd.forward(request, response);
					}
					else
					{
						System.out.println("fail");
					}
				}
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}


