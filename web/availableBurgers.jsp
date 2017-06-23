<%-- 
    Document   : availableBurgers
    Created on : Jun 15, 2017, 10:03:47 AM
    Author     : Samuel
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="java.util.ArrayList"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title> Available Burgers</title>
	<link rel="stylesheet" href="resources\bootstrap3\css\bootstrap.min.css">
	<link rel="stylesheet" href="resources\assets\css\gsdk.css">
	<link rel="stylesheet" href="resources\assets\css\demo.css">
	<link rel="stylesheet" href="resources\assets\css\my-styles.css">
	<script src="resources/jquery/jquery-1.10.2.js"></script>
        <script src="resources/assets/js/sticky-kit.min.js"></script>
</head>
<body>
<div class=container-fluid>
	<!-- navigation -->
	<div style="background-color: #e3e3e3;" class="row col-md-12">
		<nav class= "navbar navbar-ct-orange navbar-fixed-top" role = "navigation">
			<div class = "col-sm-8">
				<h3>Welcome <%=session.getAttribute("userID")%></h3>
			</div>
			<div class="col-sm-4">
				<div class="dropdown navbar-right">
					<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
						My Account
						<span class="caret"></span>
					</button>
                                        <%
                                        if (session.getAttribute("role").equals("Customer"))
                                        {
                                        %>
					<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">My Profile</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="index.jsp">Log Out</a></li>
					</ul>
                                        <%
                                        }
                                        else if (session.getAttribute("role").equals("Administrator"))
                                            {
                                        %>
                                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">My Profile</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="viewOrders.jsp">View Orders</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="addBurger.jsp">Add Burger</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="index.jsp">Log Out</a></li>
					</ul>
                                        <%
                                        }
                                        else
                                        {
                                        %>
                                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">My Profile</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="viewOrders.jsp">View Orders</a></li>
                                            
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Log Out</a></li>
					</ul>
                                        <%    
                                        }
                                        %>
				</div>
			</div>
		</nav>
	</div>

	<!-- end of nav-bar -->

	<!-- image across -->
	<div class="container-fluid dashboard" style="background: url('img/burger-bread-crackers-tomatoes-cola-food-white-kitchen-table-sit-down-help-yourself-70409499.jpg') no-repeat center;background-size:cover;  width: 100%;height: 250px; ">
		
	</div>
	<br>
	<div id="burger-div" class="row section-body">
		<div class="col-xs-1"></div>
		<div class="col-xs-8 content-list">
			<div>
				<div><h2>Available Burgers</h2></div>
			</div>
			<hr>
                        <article class="row">
					<div class="col-sm-3">
						Burger ID
					</div>
					<div class="col-sm-3">
						Name
					</div>
					<div class="col-sm-3">
						Burger ID
					</div>
					<div class="col-sm-3">
						Price
					</div>
                                       
				</article>
				<hr>
        <%!
        ArrayList<String> burgername = new ArrayList<String>();
        ArrayList<String> burgerIDStored= new ArrayList<String>();
        ArrayList<String> imageData = new ArrayList<String>();
        ArrayList<Float> price = new ArrayList<Float>();
        
       
     
        %>
        <%
        //Create connection to the database
        try
        {
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/onlineburgerapp","root","");   
         Statement st = (Statement) con.createStatement();
         ResultSet res = st.executeQuery("SELECT * FROM burgers");
         
         while(res.next())
         {
             burgerIDStored.add(res.getString("burger_id").trim());
             burgername.add(res.getString("burger_name").trim());
             price.add(res.getFloat("Price"));
             //pprice = Float.toString(price);
             imageData.add(res.getString("burger_picture"));
//             imageData.add(res.getBytes("burger_picture"));       
         }
         
         con.close();
         
         for (int i = 0; i < burgerIDStored.size(); i++) {
                 %>
                 <article class="row">
					<div class="col-sm-3">
                                            <% out.print(burgerIDStored.get(i)); %>
					</div>
					<div class="col-sm-3">
						<img  class="img-thumbnail" src="<%out.print(imageData.get(i));%>" alt="<%out.print(burgerIDStored.get(i));%>">
					</div>
					<div class="col-sm-3">
						<% out.print(burgername.get(i)); %>
					</div>
					<div class="col-sm-3">
                                            <% out.print(price.get(i)); %>
                                            <img id="btn1" src="img/add1_25px.png" alt="" role="button" onclick="changeBtn('btn1')">
					</div>
				</article>
				<hr>
             <%                   
                        }
                   }
                   catch (SQLException ex)
                   {
                       out.write(ex.getMessage());
                   }
                                                         

   
             %>

		</div>
		<div id ="checkoutbar" class="col-xs-3 content-list" style="margin: 0px -5px 0px 5px;">
			<div class="content-list">
			<div><h2>Your Order</h2></div>
			
			<div>
				<table class="table table-responsive">
					<tbody>
						<tr>
							<td>Name</td>
							<td> Unit Price</td>
							<td>Quantity</td>
						</tr>
						<tr>
							<td>Sub-total</td>
							<td></td>
							<td>Price</td>
						</tr>
						
					</tbody>
					
				</table>
			</div>
				
			</div>
		</div>

	
	</div>	
	</div>
</div>
</body>


	<script src="resources/jquery/jquery-1.10.2.js"></script>
	<script src="resources/assets/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>

	<script src="resources/bootstrap3/js/bootstrap.js" type="text/javascript"></script>
	<script src="resources/assets/js/gsdk-checkbox.js"></script>
	<script src="resources/assets/js/gsdk-radio.js"></script>
	<script src="resources/assets/js/gsdk-bootstrapswitch.js"></script>
	<script src="resources/assets/js/get-shit-done.js"></script>
	<script src="resources/assets/js/custom.js"></script>
        <script src="resources/assets/js/sticky-kit.min.js"></script>
        <script>
            $("#checkoutbar").stick_in_parent();

		function changeBtn(id_of_btn) {
		//get the password input box
		var btn = document.getElementById(id_of_btn);
                if (btn.src=="img/add1_25px.png")
		{btn.setAttribute('src', "img/Minus1_25px.png");}
	}

	</script>

</html>
