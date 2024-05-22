package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Appoinmentbean;
import com.model.AppoinmentModel;

@WebServlet("/cancelappoinment")
public class cancelappoinment extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public cancelappoinment() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AppoinmentModel m = new AppoinmentModel();
		Appoinmentbean s=m.cancelappoinment();
		System.out.println(s.getId());
		
		
		
		int i=m.deleteappoinment(s);
		if(i>0)
			System.out.println("success");
		else
			System.out.println("near to success");
		
		response.sendRedirect("cancelappoinment.jsp");
		
	}

}
