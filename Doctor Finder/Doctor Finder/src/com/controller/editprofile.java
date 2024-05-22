package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bin.Registrationbean;
import com.model.Registrationmodel;

/**
 * Servlet implementation class editprofile
 */
@WebServlet("/editprofile")
public class editprofile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editprofile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Registrationbean rb = new Registrationbean();
		rb.setId(Integer.parseInt(request.getParameter("id")));
		rb.setFname(request.getParameter("fname"));
		rb.setLname(request.getParameter("lname"));
		rb.setEmail(request.getParameter("email"));
		rb.setPh_no(request.getParameter("phno"));
		rb.setPass(request.getParameter("pwd"));
		rb.setCpass(request.getParameter("cpwd"));
		rb.setDob(request.getParameter("date"));
		
		Registrationmodel rm = new Registrationmodel();
		
		rm.updateuser(rb);
		HttpSession session = request.getSession();
		session.removeAttribute("raj");
		session.setAttribute("raj", rb);
		response.sendRedirect("profile.jsp");
		
	}

}
