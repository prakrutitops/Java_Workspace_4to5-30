<%@page import="com.model.CartModel"%>
<%@page import="com.model.WishlistModel"%>
<%@page import="com.dao.Dao"%>
<%@page import="com.Imadata.ImageDao"%>
<%@page import="com.Imadata.ImageModel"%>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Cart</title>

    <style>
        .product-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            grid-gap: 20px;
            padding: 20px;
        }
        .product {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        .product img {
            max-width: 100px;
            max-height: 100px;
        }
        .swd-button 
			{
				background: #f2db18;
				border: 1px solid white;
				border-radius: 5px;
				color: white;
				display: inline-block;
				font: bold 12px Arial, Helvetica, sans-serif;
				padding: 10px 15px;
				text-decoration: none;
				text-transform: uppercase;
				margin-top: 15px;
			}
        
    </style>
</head>
<body>

	<jsp:include page="header.jsp"/>    
	
    <div class="product-grid">
        <% 
        // Your Java code to retrieve product data from the database goes here
        // For demonstration purposes, let's assume you have a list of Product objects
        
        List<CartModel> list = Dao.cartgetAll();// Method to retrieve product data from the database
        
        // Iterate over the product list and generate HTML for each product
         for (CartModel m : list) 
        {
        %>
        <div class="product">
            <img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
            <h3><%= m.getP_name() %></h3>
            <p>Price: <%= m.getP_price() %></p>
            
           
          
			<%-- <p><%=currAmount%></p> --%>
           
  <!-- 
     <a href="counter.jsp"><img alt="plus" src="icon/plus.png" width="25" height="25"><input type="text" name="plus"></a>  
           <input type="text" name="counter" value="1" style="width: 35px;">
          <a href="counter.jsp"><img al	t="minus" src="icon/minus.png" width="25" height="25"><input type="text" name="minus"></a>   --> 
          
        
          <form action="deletecart.jsp">
            	<input type="hidden" name="id" value="<%=m.getId()%>">
            	<input type="submit" class="swd-button" value="Remove">
          </form>
          
            
        
       <!-- 	<a class="swd-button" href="addtowishlist.jsp">Wishlist</a> 
     	<a class="swd-button" href="addtocart.jsp">Cart</a>  -->
            <!-- Add more product details as needed -->
        </div>
        <% } %>
    </div>
    
    
    	<jsp:include page="footer.jsp"/>    
    
</body>
</html>
