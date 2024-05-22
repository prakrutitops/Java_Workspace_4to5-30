package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.bin.Doctorsbean;
import com.model.Doctorsmodel;

/**
 * Servlet implementation class AdminDr
 */
@WebServlet("/AdminDr")
public class AdminDr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDr() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Doctorsbean drb = new Doctorsbean();
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory);
		File f = null;
		String path = null, imgname= null, path1=null;
		FileItem fItem = null;
		
		try
		{
			List<FileItem> items = sfu.parseRequest(request);
			for(FileItem fitem : items)
			{
				if(fitem.isFormField())
				{
					if(fitem.getFieldName().equalsIgnoreCase("drname"))
						drb.setName(fitem.getString());
					if(fitem.getFieldName().equalsIgnoreCase("dremail"))
						drb.setEmail(fitem.getString());
					if(fitem.getFieldName().equalsIgnoreCase("drspeciality"))
						drb.setSpeciality(fitem.getString());
					if(fitem.getFieldName().equalsIgnoreCase("drphno"))
						drb.setContact_no(fitem.getString());
					if(fitem.getFieldName().equalsIgnoreCase("drloc"))
						drb.setLocation(fitem.getString());
					if(fitem.getFieldName().equalsIgnoreCase("draddr"))
						drb.setAddress(fitem.getString());
				}
				else
				{
					fItem=fitem;
					path1 = request.getServletContext().getRealPath("");
					System.out.println("Test Path : "+path1);
					imgname = fitem.getName();
					System.out.println("Image Name : "+imgname);
				}
			}
			
			f = new File(path1 + File.separator + imgname);
			fItem.write(f);
			drb.setImage(imgname);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
//		drb.setName(request.getParameter("drname"));
//		drb.setEmail(request.getParameter("dremail"));
//		drb.setSpeciality(request.getParameter("drspeciality"));
//		drb.setContact_no(request.getParameter("drphno"));
//		drb.setLocation(request.getParameter("drloc"));
//		drb.setAddress(request.getParameter("draddr"));
//		drb.setImage(request.getParameter("drimg"));
		
		Doctorsmodel drm = new Doctorsmodel();
		drm.adddoctor(drb);
		response.sendRedirect("lumino/all_dr.jsp");
		
	}

}
