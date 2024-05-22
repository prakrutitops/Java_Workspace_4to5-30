package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bin.Feedbackbean;
import com.bin.Registrationbean;
import com.model.Model;

/**
 * Servlet implementation class feedback
 */
@WebServlet("/feedback")
public class feedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public feedback() {
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
		HttpSession session = request.getSession();
		Registrationbean str = (Registrationbean) session.getAttribute("raj");
		System.out.println("m in feedback controller");
		
		Feedbackbean fdb = new Feedbackbean();
		
		fdb.setFdrname(request.getParameter("dr"));
		fdb.setFdrspeciality(request.getParameter("Speciality"));
		System.out.println(request.getParameter("Speciality"));
		fdb.setFmsg(request.getParameter("msg"));
		fdb.setFuser(str.getFname()+" "+str.getLname() );
		
		Model m = new Model();
		m.addfeedback(fdb);
		
		response.sendRedirect("Rating.jsp");
	}

}
