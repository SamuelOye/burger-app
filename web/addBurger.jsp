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
					<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		
					<li role="presentation"><a role="menuitem" tabindex="-1" href="availableBurgers.jsp">Home</a></li>
    					<li role="presentation"><a role="menuitem" tabindex="-1" href="#">My Profile</a></li>
    					<li role="presentation"><a role="menuitem" tabindex="-1" href="viewOrders.jsp">View Orders</a></li>
                                        <li role="presentation"><a role="menuitem" tabindex="-1" href="index.jsp">Log Out</a></li>
					</ul>
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
		<div class="col-xs-3"></div>
		<div class="col-xs-6 content-list">
			<div><h2>Add New Burgers</h2></div>
			<hr>
        <!-- Dynamically generate content for the page-->
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
                <div class="form-group">
                        <button class="btn btn-default col-xs-12" onclick="displayForm()"><a href="#addBurgerDiv">Add New Burger</a></button>
                </div>
		</div>
		<div class="col-xs-3"></div>

	</div>
                <div id="burger-div" class="row section-body">
                    <div class="col-xs-3"></div>
                    <div style="display: none;" id="addBurgerDiv" class="col-xs-6 content-list  form-control-feedback text-center">
                        <form action="addNewBurger.jsp" class="form-group form-horizontal" method="POST">
                            <div class="form-group">
                                    <label class="pull-left">Burger ID</label>
                                    <input type="text" class="form-control input-xs">
                            </div>
                            <div class="form-group">
                                    <label class="pull-left">Burger Name</label>
                                    <input type="text" class="form-control input-xs">
                            </div>
                            <div class="form-group">
                                    <label class="pull-left">Price</label>
                                    <input type="number" class="form-control input-xs">
                            </div>
                            <div class="form-group">
                                    <label class="pull-left">Burger Picture</label>
                                    <input id="fileInput" type="file" style="display:none;" />
                                    <input type="button" value="Choose Files!" onclick="document.getElementById('fileInput').click();" />
                            </div>
                            <br>
                            <div class="form-group">
                                     <input class="btn btn-default btn-fill btn-warning" type="submit" name="addBurgerBtn" value="Add Burger" id="btn" >
                            </div>
                        </form>
                    </div>
                    <div class="col-xs-3"></div>
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
        <script>

        function displayForm()
        {
         var element = document.getElementById('addBurgerDiv');   
         element.style.display='block';
        }

	</script>

</html>

