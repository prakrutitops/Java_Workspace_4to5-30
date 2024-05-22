package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bin.Registrationbean;
import com.model.Registrationmodel;


@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Logincontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		System.out.println("M In Servlet to checl login...");
		PrintWriter out=response.getWriter();
		//String str=request.getParameter("submit");
		
		/*if(str.equalsIgnoreCase("login"));
		{*/
			Registrationbean r=new Registrationbean();
			String email=request.getParameter("email");
			r.setEmail(request.getParameter("email"));
			r.setPass(request.getParameter("pwd"));
			
			
			Registrationmodel rg=new Registrationmodel();
			Registrationbean flag=rg.checklogin(r);
			if(flag!=null)
			{
				HttpSession session=request.getSession(true);
				session.setAttribute("raj", flag);
				Cookie ck=new Cookie("raj", email);
				ck.setMaxAge(60*60);
				response.addCookie(ck);
				response.sendRedirect("home.jsp");
				//request.getRequestDispatcher("home.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Email or Password is Wrong");
				//response.sendRedirect("login.jsp");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			
		//}

	}

}
