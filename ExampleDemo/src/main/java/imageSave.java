import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/imageSave")
@MultipartConfig(maxFileSize=16177216)
public class imageSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String usl = "jdbc:mysql://localhost:3306/form";
		String user = "root";
		String pass = "";
		
		Part p = request.getPart("image");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//int itid = ImageDao.getITid(nam);
		
		int r = 0;
		Connection con = null;
		
		if(p!=null)
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert into usertable(fname,lname,email,image,password) values(?,?,?,?,?)");
			
				InputStream io = p.getInputStream();
				
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setString(3, email);
				ps.setBlob(4,io);
				ps.setString(5, password);
				
				
				r = ps.executeUpdate();
				
				if(r>0)
				{
					System.out.println("done");
					response.sendRedirect("login.jsp");
					
				}
				else
				{
					System.out.println("error");
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		}
}
		
		
		
