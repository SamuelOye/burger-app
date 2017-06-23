<%-- 
    Document   : verification
    Created on : Jun 15, 2017, 10:05:28 AM
    Author     : Samuel
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.PreparedStatement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<% Class.forName("com.mysql.jdbc.Driver");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
	String usernameStored;
	String passwordStored;
	Connection con;
	PreparedStatement st;
	ResultSet res;
	%>
	<%
	try 
	{
            usernameStored = "";
            passwordStored = "";
            String usernameEntered = request.getParameter("username").trim();
            String passwordEntered = request.getParameter("password").trim();
            String sql = "SELECT * FROM verification WHERE "
                    + "(username='"+usernameEntered+"'"+" AND password = '"+passwordEntered+"')";
            
            boolean verify = false;
            //Create a connection to the database
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/"+"onlineburgerapp","root","");
            st = (PreparedStatement) con.prepareStatement(sql);
            res = st.executeQuery();
            
            boolean recordExists = res.absolute(1);
            
            if (recordExists ==true)
                verify=true;
            if (verify ==true)
            {   
                
                session.setAttribute("userID",usernameEntered);
                session.setAttribute("role",res.getString("role"));
                
                response.sendRedirect("availableBurgers.jsp");
            }
            else
                response.sendRedirect("index.jsp?error="+"Your Username or Password is incorrect#section1");
                session.setAttribute("error","Your Username or Password is incorrect");
            con.close();
        
	}
        catch (Exception ex)
                {
                 response.sendRedirect("index.jsp?error="+ex.getMessage());
                }
        %>    
    </body>
</html>
