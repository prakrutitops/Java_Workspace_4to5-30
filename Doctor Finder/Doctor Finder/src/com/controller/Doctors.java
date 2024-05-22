package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Doctorsbean;
import com.bin.Registrationbean;
import com.model.Doctorsmodel;
import com.model.Registrationmodel;


@WebServlet("/Doctors")
public class Doctors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Doctors() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Areavise = request.getParameter("Areavise");
		String Speciality = request.getParameter("Speciality");
		
		Doctorsmodel dm = new Doctorsmodel();
		ArrayList<Doctorsbean> records = dm.searchdr(Areavise,Speciality);
		request.setAttribute("data", records);
		request.getRequestDispatcher("dropdowndoctors.jsp").forward(request, response);
		
	}

}
