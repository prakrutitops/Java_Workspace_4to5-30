
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Base64;
import java.util.List;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.Imadata.ImageDao;
import com.Imadata.ImageModel;

@WebServlet("/imageSave2")
@MultipartConfig(maxFileSize=16177216)
public class imageSave5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ss = request.getSession(false);
		
		if(ss != null)
		{
		
		String usl = "jdbc:mysql://localhost:3306/webwing";
		String user = "root";
		String pass = "";
		
		/*
		 * Part p = request.getPart("p_image"); System.out.println(p);
		 */
		//Part p = request.getPart("p_image");
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		String name = request.getParameter("p_name");
		String price = request.getParameter("p_price");
		int price2 = Integer.parseInt(price);
		
		String qua = request.getParameter("number");
		int qua2 = Integer.parseInt(qua);
		
		String image = request.getParameter("p_image");
		
		int fp = price2*qua2;
		
		
		
		String base64ImageData = image.split(",")[1];
		 byte[] imageData = Base64.getDecoder().decode(base64ImageData);
		 InputStream io = new ByteArrayInputStream(imageData);
		
		
		
		
		
		//InputStream io = request.getPart("p_image").getInputStream();
		//byte[] imageData = java.util.Base64.getDecoder().decode(base64Image.split(",")[1]);
		
		//int itid = ImageDao.getITid(nam);
		//System.out.println(p);
		//System.out.println(id2);
		//ImageModel m = ImageDao.getimageindexwise(id2);
		
		//System.out.println(m.getId());
		//System.out.println("get");
		//System.out.println(m.getP_image());
		
		
		int r = 0;
		Connection con = null;
	
		
			try {
				
			Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert into payment(p_name,p_price,fp,p_qua,id,p_image) values(?,?,?,?,?,?)");
				
				//InputStream io = new ByteArrayInputStream(image.getBytes(StandardCharsets.UTF_8));

				//InputStream io = m.getP_image();
				
				ps.setString(1, name);
				ps.setInt(2, price2);				
				ps.setInt(3, fp);
				ps.setInt(4,qua2);
				ps.setInt(5,id2);
				ps.setBlob(6,io);
				
				r = ps.executeUpdate();
			
				if(r>0)
				{
					System.out.println("success9");
					
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
