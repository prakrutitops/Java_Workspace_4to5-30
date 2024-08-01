package com.emailauth;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Imadata.ImageDao;
import com.Imadata.ImageModel;
import com.dao.Dao;
import com.model.PaymentModel;

@WebServlet("/EmailSendingServlet3")
public class EmailSendingServlet3 extends HttpServlet
{
	
	private String host;
	private String port;
	private String user;
	private String pass;
	
	@Override
	public void init() throws ServletException
	{
		// TODO Auto-generated method stub
		//super.init();
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String date = Calendar.getInstance().getTime().toString();
		String subject="Order Placed From Webwing ";
		
		
		HttpSession sess = req.getSession();
		String myemail = sess.getAttribute("email").toString();
		String data = myemail;
		
		String id = sess.getAttribute("id").toString();
		int id2 = Integer.parseInt(id);
		
		PaymentModel pm = ImageDao.getdatawiseid(id2);
		
		String content= "Your Order Name " + pm.getP_name() + " with price of " + pm.getP_price() + " is placed Successfully.  Time : " + date ;
		
		try 
		{
			EmailUtility.sendEmail(host, port, user, pass, data, subject,content);
			Thread.sleep(2000);
			resp.sendRedirect("cart.jsp");
		} 
		catch (AddressException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	/*
	 * String resultMessage = ""; private String host; private String port; private
	 * String user; private String pass;
	 * 
	 * 
	 * @Override public void init() throws ServletException { // TODO Auto-generated
	 * method stub //super.init(); ServletContext context = getServletContext();
	 * host = context.getInitParameter("host"); port =
	 * context.getInitParameter("port"); user = context.getInitParameter("user");
	 * pass = context.getInitParameter("pass");
	 * 
	 * }
	 * 
	 * 
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException {
	 * 
	 * 
	 * resp.setContentType("text/html"); PrintWriter out = resp.getWriter();
	 * 
	 * 
	 * Object recipient = req.getAttribute("e1"); String data = (String) recipient;
	 * String subject ="Order Placed from webwing"; String content="1234";
	 * 
	 * HttpSession sess = req.getSession();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * try { EmailUtility.sendEmail(host, port, user, pass, data, subject,content);
	 * 
	 * Thread.sleep(3000);
	 * 
	 * //RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
	 * //req.setAttribute("fname","abcd"); //rd.forward(req, resp);
	 * //resp.sendRedirect("otpverify.jsp");
	 * 
	 * resp.sendRedirect("cart.jsp"); //resp.sendRedirect("otpsend.jsp"); } catch
	 * (AddressException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (MessagingException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } catch (InterruptedException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } resultMessage =
	 * "The e-mail was sent successfully";
	 * 
	 * 
	 * 
	 * }
	 */
}
