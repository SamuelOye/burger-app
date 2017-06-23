<%-- 
    Document   : index
    Created on : Jun 15, 2017, 9:58:09 AM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
            
    
<!--    <body>
        <header></header>
        <nav>
                <ul>
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="registration.jsp">Registration</a></li>
                        <li><a href="#">Services</a></li>
                        <li><a href="#">About</a></li>
                        <li><a href="#">Contact Us</a></li>
                </ul>
        </nav>
        <div  id = 'content'>
            <br>
            <h1> WELCOME TO TASTY BURGERS DELIVERY SYSTEM</h1>
            <article>
                    We offer you the best burger you can think of and we deliver it straight to your door step. Please make sure you order right now
            </article>
            <h4> Please login to order</h4>
        <div  id="content2">
                <form name = "LoginForm" action= "verification.jsp" method = "POST">
                        <table border = "0">
                                <tbody>
                                        <tr>
                                                <td>First Name</td>
                                                <td><input type="text" name="name" value="" size="30"></td>
                                        </tr>
                                        <tr>
                                                <td>Password</td>
                                                <td><input type="password" name="password" value="" size="30"></td>
                                        </tr>
                                        <tr>
                                                <td></td>
                                                <td><input type="submit" name="buttonname" value="LOGIN" id="btn" ></td>
                                        </tr>

                                </tbody>
                        </table>
                </form>
        </div>        
        </div>


        <footer>Copyright &COPY; 2015 by CU JavaProgrammingTeam :)</footer>
    </body>
</html>-->

<head>
    <title> Available burgers</title>
    <link rel="stylesheet" href="resources/bootstrap3/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/assets/css/gsdk.css">
    <link rel="stylesheet" href="resources/assets/css/demo.css">
    <link rel="stylesheet" href="resources/assets/css/my-styles.css">
    <style type="text/css">
/*                @import url("css.css");*/
                @import url("resources/bootstrap3/css/bootstrap.min.css");
                @import url("resources/assets/css/gsdk.css");
                @import url("resources/assets/css/my-styles.css");
            </style>
            <script>
                @import url("resources/jquery/jquery-1.10.2.js")
            </script>

    
</head>
<body style="background-color:white;">
<div class="container-fluid">
    <div class="container-fluid" class="col-md-12">
        <nav class= "navbar navbar-ct-orange navbar-default navbar-fixed-top navbar-transparent" role = "navigation">
        <div class="container-fluid">
            <div style="color: black;" class= "container">
                <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                      <li style="color: #000000;"><a href="#">Home</a></li>

                      <li style="color: #000000;"><a href="#section1" class=""> Sign in</a></li>

                      <li style="color: #000000;"><a href="#section2">Register</a></li>
                    </ul>
                </div>
            </div>  
        </div>
        </nav>

        <!-- header conten -->
        <div style="position: relative; text-align: center;" >
            <img class="img-responsive" src="img\hdBurger1.jpg" alt="">
            <div class="row header-content">
                <header>ARE YOU HUNGRY</header>
                <h1 class="subtitle">Get ready for a Burger Experience </h1>
            </div>
        </div>
        <!-- end of header content -->

        <!-- login section -->
        <div id="section1" class="row section-body" >

            <div class="col-xs-4"><br></div>
            <div class="col-xs-4 form-control-feedback text-center">
                <h2>SIGN IN</h2>
                 <%= (session.getAttribute("error"))%> 
                <form action="verification.jsp" class = "form-group form-horizontal">
                    <div class="form-group">
                        <label class="pull-left">Username</label>
                        <input type="text" class="form-control input-xs" placeholder="Enter Username" name="username">
                    </div>

                    <div class="form-group">
                        <label class="pull-left">Password</label>
                        <input type="Password" id="login-password" class="form-control input-xs" placeholder="Enter Password" name="password">
                        
                        <br>
                        <label class="pull-left ct-azzure ">
                            <input type="checkbox" onclick="MakePasswordVisible(this, 'login-password');"> Show Password
                        </label> 

                    </div>
                    
                    

                    <div class="form-group">
                        <!-- <button class="btn btn-round btn-fill btn-warning">Log in</button> -->
                        <input class="btn btn-round btn-fill btn-warning" type="submit" name="loginBtn" value="Login" id="btn" >
                    </div>
                    <br>
                    <div class="form-group">
                        <button class="btn btn-default col-xs-12" target="#section2"><a href="#section2">No account? Register Below</a></button>
                    </div>
                </form>
            </div>
            <div class="col-xs-4"><br></div>
            
        </div>
        <!-- end of login section -->
        
        <!-- registration section -->
        <div id="section2" class="row section-body">
            <div class="col-xs-4"><br></div>
            <div class="col-xs-4 form-control-feedback text-center">
                <h2>REGISTER</h2>
                <form action="insertdata.jsp" class="form-group form-horizontal" method="POST">
                    <div class="form-group">
                        <label class="pull-left">Firstname</label>
                        <input type="text" class="form-control input-xs" placeholder="Enter Firstname" name="firstname">
                    </div>
                    <div class="form-group">
                        <label class="pull-left">Lastname</label>
                        <input type="text" class="form-control input-xs" placeholder="Enter Lastname" name="lastname">
                    </div>
                    <div class="form-group">
                        <label class="pull-left">Username</label>
                        <input type="text" class="form-control input-xs" placeholder="Enter Username" name="username">
                    </div>
                    <div class="form-group">
                        <label class="pull-left">Password</label>
                        <input type="password" id="registration-password" class="form-control input-xs" placeholder="Enter Password" name="password">

                        <br>
                        <label class="pull-left ct-azzure">
                            <input type="checkbox" onclick="MakePasswordVisible(this, 'login-password');"
                             > Show Password
                        </label>                        
                    </div>
                    <br>
                    <div class="form-group">
                        <label class="pull-left">Address</label>
                        <input type="text" class="form-control input-xs" placeholder="Where do you live" name="address">
                    </div>
                    <div class="form-group">
                        <label class="pull-left">Phone Number</label>
                        <input type="number" class="form-control input-xs" placeholder="Enter phone number" name="phonenumber">
                    </div>
                    <div class="form-group">
                        <label class="pull-left">Sex</label>
                        <label class= "col-sm-4">
                        <input type="radio" name="sex"  id="optionsRadio1" value="male">
                        Male
                        </label>

                        <label class= "col-sm-4">
                        <input type="radio" name="sex"  id="optionsRadio2" value="female">
                        Female
                        </label>

                    </div>
                    <br>
                        <div class="form-group">
                        <!-- <button class="btn btn-round btn-fill btn-warning">Log in</button> -->
                        <input class="btn btn-round btn-fill btn-warning" type="submit" name="registerBtn" value="Register" id="btn" >
                    </div>
                    
                </form>
            </div>
            <div class="col-xs-4"><br></div>
        </div>
    </div>
</div>

<script type="text/javascript">
    /*
    * makes password field visible or hidden
    */
    function MakePasswordVisible(checkbox, id_of_password_input) {
        //get the password input box
        var password = document.getElementById(id_of_password_input);

        if (checkbox.checked) {
            //make password visible
            password.setAttribute('type', 'text');
        }
        else
        {
            //hide password
            password.setAttribute('type', 'password');
        }
    }
    $(':radio').radio();
</script>


</body>
    
    <script src="resources/bootstrap3/js/bootstrap.js"> </script>
    <script src="resources/jquery/jquery-1.10.2.js"></script>
    <script src="resources/assets/js/jquery-ui-1.10.4.custom.min.js" type="text/javascript"></script>

    <script src="resources/bootstrap3/js/bootstrap.js" type="text/javascript"></script>
    <script src="resources/assets/js/gsdk-checkbox.js"></script>
    <script src="resources/assets/js/gsdk-radio.js"></script>
    <script src="resources/assets/js/gsdk-bootstrapswitch.js"></script>
    <script src="resources/assets/js/get-shit-done.js"></script>

</html>