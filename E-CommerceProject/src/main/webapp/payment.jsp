<%@page import="java.util.List"%>
<%@page import="com.Imadata.ImageDao"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.model.PaymentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	int id2 = Integer.parseInt(id);
	
	String p_name = request.getParameter("p_name");
	String p_price = request.getParameter("p_price");
	int myprice = Integer.parseInt(p_price);
	
	String p_qua = request.getParameter("number");
	int qua2 = Integer.parseInt(p_qua);
	//fp remaining
	
	int fp = myprice*qua2;
	
	
	List<PaymentModel>list = ImageDao.getimgfromcarttopayment(id2);
	
	for(PaymentModel pm :list)
	{
		pm.setId(id2);
		pm.setP_name(p_name);
		pm.setP_price(myprice);
		pm.setP_qua(qua2);
		pm.setFp(fp);
		pm.setP_image(pm.getP_image());
		
		int data = Dao.paymentinsert(pm);
		
		if(data>0)
		{
			out.print("done");
		}
		else
		{
			out.print("error");	
		}
	}
	
	
	
	

	
	
	
	
	
	
	
%>



</body>
</html>