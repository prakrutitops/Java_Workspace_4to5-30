package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bin.Doctorsbean;
import com.model.Doctorsmodel;

@WebServlet("/search")
public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public search() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str = request.getParameter("drname");
		Doctorsmodel s = new Doctorsmodel();
		System.out.println("String to search :- "+str);
		ArrayList<Doctorsbean> m = s.getdoctorbyname(str);
		System.out.println("Records Got :- "+m.size());
		System.out.println("servlet");
		request.setAttribute("raj", m);
		request.getRequestDispatcher("Searchbyname.jsp").forward(request, response);
		 
	}

}
