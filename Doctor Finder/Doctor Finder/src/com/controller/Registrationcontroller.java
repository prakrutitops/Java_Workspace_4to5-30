package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.bin.Registrationbean;
import com.model.Registrationmodel;

/**
 * Servlet implementation class registration
 */
@WebServlet("/registration")
public class Registrationcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrationcontroller() {
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
		System.out.println("Welcome to controller");
		
		Registrationbean b =  new Registrationbean();
		
		b.setFname(request.getParameter("fname"));
		b.setLname(request.getParameter("lname"));
		b.setEmail(request.getParameter("email"));
		b.setPh_no(request.getParameter("phno"));
		b.setPass(request.getParameter("pwd"));
		b.setCpass(request.getParameter("cpwd"));
		b.setGen(request.getParameter("gen"));
		b.setDob(request.getParameter("date"));
		
		Registrationmodel m = new Registrationmodel();
		
		m.add_user(b);
		response.sendRedirect("home.jsp");
	}

}
