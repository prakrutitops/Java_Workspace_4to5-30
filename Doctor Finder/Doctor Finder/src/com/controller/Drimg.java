package com.controller;

import java.awt.List;
import java.io.File;
import java.io.IOException;
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
 * Servlet implementation class Drimg
 */
@WebServlet("/Drimg")
public class Drimg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Drimg() {
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
		Doctorsmodel drm = new Doctorsmodel();
		int result = 0;
		DiskFileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload sfu = new ServletFileUpload(factory);
		File f = null;
		String path = null, imgname= null, path1=null;
		FileItem fItem = null;
		
		
		
		try
		{
			java.util.List<FileItem> list = sfu.parseRequest(request);
			for(FileItem item : list)
			{
				if(!item.isFormField())
				{
					fItem=item;
					path=request.getServletContext().getRealPath("");
					System.out.println("Path :- "+path);
					imgname=item.getName();
					System.out.println("Iamge Name :- "+imgname);
					drb.setImage(imgname);
				}
				else
				{
					if(item.getFieldName().equalsIgnoreCase("id"))
						drb.setId(Integer.parseInt(item.getString()));
				}
			}
			
			f = new File(path+File.separator+imgname);
			System.out.println("Path Specified in File Constructor :- "+path+File.separator+imgname);
			fItem.write(f);
			result = drm.savedrimg(drb);
			response.sendRedirect("lumino/all_dr.jsp");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
