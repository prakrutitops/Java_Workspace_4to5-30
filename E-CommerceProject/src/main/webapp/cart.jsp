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
        
        List<CartModel> list = Dao.cartgetAll();// Method to retrieve product data from the database
        
        // Iterate over the product list and generate HTML for each product
         for (CartModel m : list) 
        {
        %>
        <div class="product">
            <img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
            <h3><%= m.getP_name() %></h3>
            <p>Price: <%= m.getFp() %></p>
            
          
      		
      		
        
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
