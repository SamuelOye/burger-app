package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.ImageIcon;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.Connection;
import java.util.ArrayList;

public final class availableBurgers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        ArrayList<String> burgername = new ArrayList<String>();
        ArrayList<String> burgerIDStored= new ArrayList<String>();
        ArrayList<Object> imageData = new ArrayList<Object>();
        ArrayList<Float> price = new ArrayList<Float>();
        
       
     
        
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("   <head>\n");
      out.write("    <title> Available burgers</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        @import url(\"resources/bootstrap3/css/bootstrap.min.css\");\n");
      out.write("        @import url(\"resources/assets/css/gsdk.css\");\n");
      out.write("        @import url(\"resources/assets/css/my-styles.css\");\n");
      out.write("    </style>\n");
      out.write("    <script>\n");
      out.write("        @import url(\"resources/jquery/jquery-1.10.2.js\")\n");
      out.write("    </script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/bootstrap3/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/gsdk.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/my-styles.css\">\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=container-fluid>\n");
      out.write("\t<!-- navigation -->\n");
      out.write("\t<div class=\"row col-md-12\">\n");
      out.write("\t\t<nav class= \"navbar navbar-ct-orange navbar-fixed-top navbar-transparent\" role = \"navigation\">\n");
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
      out.write("\n");
      out.write("\t<!-- end of nav-bar -->\n");
      out.write("\n");
      out.write("\t<!-- image across -->\n");
      out.write("\t<div class=\"container-fluid dashboard\" style=\"background: url('img/burgerwithside2.jpg') no-repeat center;background-size:contain;  width: 100%;height: 250px; \">\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<div id=\"burger-div\" class=\"row section-body\">\n");
      out.write("\t\t<div class=\"col-xs-3\"></div>\n");
      out.write("\t\t<div class=\"col-xs-6\" id=\"burger-list\">\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<div><h2>Available Burgers</h2></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<hr>\n");
      out.write("\t\t\t<div >\n");
      out.write("\t\t\t\t<article class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tBurger ID\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tName\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tBurger ID\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\tPrice\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

        //Create connection to the database
        try
        {
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pburgerapp","root","");   
         Statement st = (Statement) con.createStatement();
         ResultSet res = st.executeQuery("SELECT * FROM burgers");
         
         while(res.next())
         {
             burgerIDStored.add(res.getString("burger_id").trim());
             burgername.add(res.getString("burger_name").trim());
             price.add(res.getFloat("Price"));
             //pprice = Float.toString(price);
             ImageIcon format = new ImageIcon(res.getBytes("burger_picture"));
             imageData.add(format);
//             imageData.add(res.getBytes("burger_picture"));       
         }
         
         con.close();
         
         for (int i = 0; i < burgerIDStored.size(); i++) {
                 
      out.write("\n");
      out.write("                 <article class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                            ");
 out.print(burgerIDStored.get(i)); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t<img  class=\"img-thumbnail\" src=\"");
out.print(imageData.get(i));
      out.write("\" alt=\"");
out.print(burgerIDStored.get(i));
      out.write("\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("\t\t\t\t\t\t");
 out.print(burgername.get(i)); 
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-sm-3\">\n");
      out.write("                                            ");
 out.print(price.get(i)); 
      out.write("\n");
      out.write("                                            <img id=\"btn1\" src=\"img/add1_25px.png\" alt=\"\" role=\"button\" onclick=\"changeBtn('btn1')\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</article>\n");
      out.write("\t\t\t\t<hr>\n");
      out.write("             ");
                   
                        }
                   }
                   catch (SQLException ex)
                   {
                       out.write("Error");
                   }
                                                         

   
             
      out.write("\n");
      out.write("\t\t\t\t<article class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\tb001\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t<img  class=\"img-thumbnail\" src=\"img/burger2.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit. Eos, ad, iure. Fugiat quos soluta dolorem placeat\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\tPrice\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</article>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-xs-3\"></div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t</div>\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script src=\"resources/jquery/jquery-1.10.2.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/jquery-ui-1.10.4.custom.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"resources/bootstrap3/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/gsdk-checkbox.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/gsdk-radio.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/gsdk-bootstrapswitch.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/get-shit-done.js\"></script>\n");
      out.write("\t<script src=\"resources/assets/js/custom.js\"></script>\n");
      out.write("\n");
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
