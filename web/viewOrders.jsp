<%-- 
    Document   : viewOrders
    Created on : Jun 19, 2017, 1:42:58 AM
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
	<title>View Orders</title>
	<link rel="stylesheet" href="resources\bootstrap3\css\bootstrap.min.css">
	<link rel="stylesheet" href="resources\assets\css\gsdk.css">
	<link rel="stylesheet" href="resources\assets\css\demo.css">
	<link rel="stylesheet" href="resources\assets\css\my-styles.css">
	<script src="resources/jquery/jquery-1.10.2.js"></script>
</head>
<body>
	<div class=container-fluid>
	<!-- navigation -->
	<div class="row col-md-12">
		<nav class= "navbar navbar-ct-orange navbar-fixed-top" role = "navigation">
			<div class = "col-sm-8">
				<h3>Welcome  <%=session.getAttribute("userID")%></h3>
			</div>
			<div class="col-sm-4">
				<div class="dropdown navbar-right">
					<button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
						My Account
						<span class="caret"></span>
					</button>
                                        <%
                                         if (session.getAttribute("role").equals("dministrator"))
                                            {
                                        %>
                                        <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="availableBurgers.jsp">Home</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="viewOrders.jsp">My Profile</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="addBurger.jsp">Add Burger</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="index.jsp">Log Out</a></li>
					</ul>
                                        <%
                                        }
                                        else
                                        {
                                        %>
                                            <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="availableBurgers.jsp">Home</a></li>
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="viewOrders.jsp">My Profile</a></li>
                                            
                                            <li role="presentation"><a role="menuitem" tabindex="-1" href="index.jsp">Log Out</a></li>
					</ul>
                                        <%    
                                        }
                                        %>
				</div>
			</div>
		</nav>
	</div>
	<!-- image across -->
	<div class="container-fluid dashboard" style="background: url('img/burger-bread-crackers-tomatoes-cola-food-white-kitchen-table-sit-down-help-yourself-70409499.jpg') no-repeat center;background-size:cover;  width: 100%;height: 250px; ">
		
	</div>
	<br>
	<div id="order-div" class="row section-body">
		<div class="col-xs-3"></div>
		<div class="col-xs-6 content-list">
			<div>
				<div><h2>View Orders</h2></div>
			</div>
			<hr>
			<div >
				<article class="row">
					<div class="col-sm-3">
						Username
					</div>
					<div class="col-sm-3">
						Order Type
					</div>
					<div class="col-sm-3">
						Quantity
					</div>
					<div class="col-sm-3">
						Delivery Address
					</div>
				</article>
				<hr>
                                <%!
        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> orderType= new ArrayList<String>();
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<Integer> quantity = new ArrayList<Integer>();
        
       
     
        %>
        <%
        //Create connection to the database
        try
        {
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp","root","");   
         Statement st = (Statement) con.createStatement();
         ResultSet res = st.executeQuery("SELECT * FROM ordertable");
         
         while(res.next())
         {
             username.add(res.getString("username").trim());
             orderType.add(res.getString("order_type").trim());
             quantity.add(res.getInt("quantity"));
             //pprice = Float.toString(price);
             address.add(res.getString("delivery_address"));
//             imageData.add(res.getBytes("burger_picture"));       
         }
         
         con.close();
         
         for (int i = 0; i < username.size(); i++) {
                 %>
                 <article class="row">
					<div class="col-sm-3">
                                            <% out.print(username.get(i)); %>
					</div>
					<div class="col-sm-3">
						<%out.print(orderType.get(i));%>
					</div>
					<div class="col-sm-3">
						<% out.print(quantity.get(i)); %>
					</div>
					<div class="col-sm-3">
                                            <% out.print(address.get(i)); %>
                                            
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
		<div class="col-xs-3"></div>

	
	</div>	
	</div>
        </div>
</body>
</html>
