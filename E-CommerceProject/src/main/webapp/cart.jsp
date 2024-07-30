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
        .swd-button2 
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
				margin-right: 75px;
			}
			
			form {
  width: 300px;
  margin: 0 auto;
  text-align: center;
  padding-top: 50px;
}

.value-button {
  display: inline-block;
  border: 1px solid #ddd;
  margin: 0px;
  width: 40px;
  height: 20px;
  text-align: center;
  vertical-align: middle;
  padding: 11px 0;
  background: #eee;
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  -khtml-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

.value-button:hover {
  cursor: pointer;
}

form #decrease {
  margin-right: -4px;
  border-radius: 8px 0 0 8px;
}

form #increase {
  margin-left: -4px;
  border-radius: 0 8px 8px 0;
}

form #input-wrap {
  margin: 0px;
  padding: 0px;
}

input#number {
  text-align: center;
  border: none;
  border-top: 1px solid #ddd;
  border-bottom: 1px solid #ddd;
  margin: 0px;
  width: 40px;
  height: 40px;
}

input[type=number]::-webkit-inner-spin-button,
input[type=number]::-webkit-outer-spin-button {
    -webkit-appearance: none;
    margin: 0;
}
        
    </style>
    
  <script type="text/javascript">

    function decreaseQuantity(element) {
        var input = element.nextElementSibling;
        var value = parseInt(input.value, 10);
        if (value > 0) {
            input.value = value - 1;
        }
    }

    // Function to increase quantity
    function increaseQuantity(element) {
        var input = element.previousElementSibling;
        var value = parseInt(input.value, 10);
        input.value = value + 1;
    }

    // Function to get final quantity
    function getFinalQuantity() {
        var products = document.getElementsByClassName('product');
        var totalQuantity = 0;
        
        for (var i = 0; i < products.length; i++) {
            var quantityInput = products[i].querySelector('.quantity-input');
            var quantity = parseInt(quantityInput.value, 10);
            totalQuantity += quantity;
        }
        
        console.log('Final Quantity:', totalQuantity);
        // You can use `totalQuantity` variable for further processing
    }
    </script>

    
    
</head>
<body>


	<jsp:include page="header.jsp"/>    
	
    <div class="product-grid">
        <% 
        // Your Java code to retrieve product data from the database goes here
        // For demonstration purposes, let's assume you have a list of Product objects
        ;
        List<CartModel> list = Dao.cartgetAll(session.getAttribute("email").toString());// Method to retrieve product data from the database
        
        // Iterate over the product list and generate HTML for each product
         for (CartModel m : list) 
        {
        %>
        <div class="product">
            <img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
            <br>
            <p><b>Product Name:</b><h3><%= m.getP_name() %></h3></p>
            <p><b>Quantity:</b> <h3><%= m.getP_qua() %></h3></p>
            <p><b>Price:</b><%= m.getFp() %></p>
            
          <form action="imageSave5" method="post" enctype="multipart/form-data" class="requires-validation" novalidate>
	          
	         
      		
            	  

                 <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_name" placeholder="Product Name" value="<%=m.getP_name() %>" required>
                     </div>
                            
                            <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_price" placeholder="Product Price" value="<%=m.getP_price() %>" required>
                            </div>
                            
                            
                            <div class="col-md-12">
                               <input class="form-control" type="hidden" name="fp" placeholder="Product Price" value="<%=m.getFp() %>" required>
                            </div>
                            
                        	<div class="col-md-12">
                               <input class="form-control" type="hidden" name="id" placeholder="Product id" value="<%=m.getId() %>" required>
                            </div>
                            
                            
                             <div class="col-md-12">
                               <input class="form-control" type="hidden" name="p_qua" placeholder="Product quantity" value="<%=m.getP_qua() %>" required>
                            </div>
                            
                             <div class="col-md-12">
                            	<input type="hidden" name="p_image" value="data:image/jpeg;base64,<%=m.getP_image() %>" /> 
                             </div>
                            
                           

            	<input type="submit" class="swd-button" style="margin-right: 100px;" value="Proceed to Payment">
          </form>
	
      		
      		
        
          <form action="deletecart.jsp">
            	<input type="hidden" name="id" value="<%=m.getId()%>">
            	<input type="submit" class="swd-button2" value="Remove">
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
