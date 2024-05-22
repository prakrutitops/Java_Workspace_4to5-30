package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Appoinmentbean;
import com.model.AppoinmentModel;
import com.model.Doctorsmodel;

@WebServlet("/appoinment")
public class appoinment extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public appoinment() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		String to=request.getParameter("to");		
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		String user=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		Appoinmentbean s = new Appoinmentbean();
		String drname=request.getParameter("drname");
		String dremail=Doctorsmodel.getDoctorEmail(drname);
		System.out.println(dremail);
		s.setDrName(request.getParameter("drname"));
		s.setDrSpeciality(request.getParameter("Speciality"));
		s.setAppoinmentDate(request.getParameter("date"));
		s.setAppoinmentTime(request.getParameter("time"));
		
		SendMail.send(to, dremail,subject, message, user, pass);
		
		
		AppoinmentModel m = new AppoinmentModel();
		m.addappoinment(s);
		response.sendRedirect("Appoinmentdone.jsp");
	}

}
