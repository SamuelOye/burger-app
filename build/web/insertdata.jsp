<%-- 
    Document   : insertdata
    Created on : Jun 15, 2017, 10:04:22 AM
    Author     : Samuel
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="com.mysql.jdbc.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
            String firstname,lastname,username,address,phoneNo;
            String sex,password;
        %>
        <%
            firstname = lastname = username= address= phoneNo="";
            sex = "";password="";
            firstname = request.getParameter("firstname").trim();
            lastname = request.getParameter("lastname").trim();
            username = request.getParameter("username").trim();
            address = request.getParameter("address").trim();
            phoneNo = request.getParameter("phonenumber").trim();
            sex = request.getParameter("sex");
            password = request.getParameter("password").trim();
            out.write(firstname+"','"+lastname+"','"+address+"','"+phoneNo+"','"+sex+"','"+password+"','Customer'");
            //JOptionPane.showMessageDialog(null,);
            if (firstname.equals("")||lastname.equals("")||address.equals("")||phoneNo.equals("")
                    ||sex.equals("")||password.equals(""))
            {
                out.write("Empty fields, make sure you input data into all fields before pushing the REGISTER button");
            }
            else
            {
                String sql1 = "INSERT INTO registration VALUES('"+firstname+"','"+lastname+"','"+address+"','"+username+"','"+phoneNo+"','"+sex+"','"+password+"','Customer')";
                String sql2 = "INSERT INTO verification VALUES('"+username+"','"+password+"','Customer')";
                
                try
                {
                    Connection conn= (Connection)DriverManager.getConnection("jdbc:mysql://localhost/onlineburgerapp", "root","");
                    Statement st = (Statement)conn.createStatement();
                    st.executeUpdate(sql1);
                    st.executeUpdate(sql2);
                    
                    conn.setAutoCommit(true);
                    session.setAttribute("userID",username);
                    session.setAttribute("role","Customer");
                    conn.close();
                    response.sendRedirect("availableBurgers.jsp");
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        %>
    </body>
</html>
