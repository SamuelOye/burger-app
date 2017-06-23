<%-- 
    Document   : registration
    Created on : Jun 15, 2017, 10:04:44 AM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            header{width:1320px;height:200px;background:url(tastyburger2.png);text-align:center;
                   padding-top:20px;color:yellow;font-size:3em;font-family:Hodo std; }
            body{background:beige ; font-family: Lato, sans-serif}
            header,nav, div{margin: auto;}
            nav{border-top:2px groove yellow;width:1320px;height:60px;background:url(nav.jpg);}
            #content{width:1320px;height:600px;background:url(bg1.jpg); background-size:cover; 
                     color: crimson; text-align: center; align-self:center }
            #content2{display: table; margin: 0 auto; font-weight:bolder}
            #btn{background-color:blanchedalmond; font-weight:bolder}
            ul{padding-top:5px;margin:0; text-align: center}
            footer{text-align:center; color:brown; font-weight:bolder; font-size: x-large}
            li{display:inline;list-style:none;padding:4px;margin:4px;}
            alink{color:white;font-size:20px;font-family:Palatino Linotype;text-decoration:none;}
            a:visited{color:white;font-size:20px;font-family:Palatino Linotype;text-decoration:none;}
            a:hover{color:blue;text-decoration:underline;}
        </style>  
    </head>
    <body>
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
            <h4> WELCOME TO TASTY BURGERS DELIVERY SYSTEM</h4>
            <article>
                    We offer you the best burger you can think of and we deliver it straight to your door step. Please make sure you order right now
            </article>
            <h4>Please fill in your details to register</h4>
            <div id='content2'>
                <form name="RegisterForm" action="insertdata.jsp" method="POST">
                    <table border="0" cellpadding="1">

                        <tbody>
                            <tr>
                                <td>First Name</td>
                                <td><input type="text" name="firstname" value=""/></td>
                            </tr>
                            <tr>
                                <td>Last Name</td>
                                <td><input type="text" name="lastname" value=""/></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><input name="address" rows="4" cols="20" /></td>
                            </tr>
                            <tr>
                                <td>Phone Number</td>
                                <td><input type="text" name="phoneNo" value="" /></td>
                            </tr>
                            <tr>
                                <td>Sex</td>
                                <td>
                                    <select name="sex">
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td>Password</td>
                                <td><input type="password" name="password" value="" /></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" name="buttonname" value="REGISTER" id='btn' /></td>
                            </tr>
                        </tbody>
                    </table>

                </form>
            </div>
        </div>
        
    </body>
</html>
