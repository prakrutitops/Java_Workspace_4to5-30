package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Model;

/**
 * Servlet implementation class getSpeciality
 */
@WebServlet("/getSpeciality")
public class getSpeciality extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSpeciality() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		String val=request.getParameter("val");
		PrintWriter out=response.getWriter();
		
		try
		{
			Model m=new Model();
			String result=m.getSP(val);
			System.out.println(result);
			out.print(result);
			
			request.setAttribute("sp", result);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
