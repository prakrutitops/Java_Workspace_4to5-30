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
		
		HttpSession ss = request.getSession(false);
		
		if(ss != null)
		{
		
		String usl = "jdbc:mysql://localhost:3306/webwing";
		String user = "root";
		String pass = "";
		
		Part p = request.getPart("p_image");
		String name = request.getParameter("p_name");
		String price = request.getParameter("p_price");
		String description = request.getParameter("p_des");
		
		//int itid = ImageDao.getITid(nam);
		
		int r = 0;
		Connection con = null;
		
		if(p!=null)
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert into products(p_name,p_price,p_des,p_image) values(?,?,?,?)");
			
				InputStream io = p.getInputStream();
				
				ps.setString(1, name);
				ps.setString(2, price);
				ps.setString(3, description);
				ps.setBlob(4,io);
				
				r = ps.executeUpdate();
				
				if(r>0)
				{
					System.out.println("done");
					response.sendRedirect("adminviewproducts.jsp");
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
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
		
		
	}

}
