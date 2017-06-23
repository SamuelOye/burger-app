package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;

public final class viewOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        ArrayList<String> username = new ArrayList<String>();
        ArrayList<String> orderType= new ArrayList<String>();
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<Float> quantity = new ArrayList<Float>();
        
       
     
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 Class.forName("com.mysql.jdbc.Driver");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>View Orders</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources\\bootstrap3\\css\\bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources\\assets\\css\\gsdk.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources\\assets\\css\\demo.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources\\assets\\css\\my-styles.css\">\n");
      out.write("\t<script src=\"resources/jquery/jquery-1.10.2.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=container-fluid>\n");
      out.write("\t<!-- navigation -->\n");
      out.write("\t<div class=\"row col-md-12\">\n");
      out.write("\t\t<nav class= \"navbar navbar-ct-orange navbar-fixed-top\" role = \"navigation\">\n");
      out.write("\t\t\t<div class = \"col-sm-8\">\n");
      out.write("\t\t\t\t<h3>Welcome</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t<div class=\"dropdown navbar-right\">\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-default dropdown-toggle\" type=\"button\" id=\"dropdownMenu1\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("\t\t\t\t\t\tMy Account\n");
      out.write("\t\t\t\t\t\t<span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"dropdownMenu1\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">My Profile</a></li>\n");
      out.write("    \t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Another action</a></li>\n");
      out.write("    \t\t\t\t\t<li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">Something else here</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- image across -->\n");
      out.write("\t<div class=\"container-fluid dashboard\" style=\"background: url('img/burger-bread-crackers-tomatoes-cola-food-white-kitchen-table-sit-down-help-yourself-70409499.jpg') no-repeat center;background-size:cover;  width: 100%;height: 250px; \">\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<div id=\"order-div\" class=\"row section-body\">\n");
      out.write("\t\t<div class=\"col-xs-3\"></div>\n");
      out.write("\t\t<div class=\"col-xs-6\" id=\"burger-list\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div><h2>View Orders</h2></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<div >\n");
      out.write("\t\t\t\t<article class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tUsername\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tOrder Type\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tQuantity\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tDelivery Address\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("                                ");
      out.write("\n");
      out.write("        ");

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
             quantity.add(res.getFloat("quantity"));
             //pprice = Float.toString(price);
             address.add(res.getString("delivery_address"));
//             imageData.add(res.getBytes("burger_picture"));       
         }
         
         con.close();
         
         for (int i = 0; i < username.size(); i++) {
                 
      out.write("\n");
      out.write("                 <article class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                            ");
 out.print(username.get(i)); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t");
out.print(orderType.get(i));
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t");
 out.print(quantity.get(i)); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                            ");
 out.print(address.get(i)); 
      out.write("\n");
      out.write("                                            \n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("             ");
                   
                        }
                   }
                   catch (SQLException ex)
                   {
                       out.write(ex.getMessage());
                   }
                                                         

   
             
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-3\"></div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
