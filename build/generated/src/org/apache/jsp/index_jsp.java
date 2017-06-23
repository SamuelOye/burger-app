package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("    \n");
      out.write("<!--    <body>\n");
      out.write("        <header></header>\n");
      out.write("        <nav>\n");
      out.write("                <ul>\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                        <li><a href=\"#\">Services</a></li>\n");
      out.write("                        <li><a href=\"#\">About</a></li>\n");
      out.write("                        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div  id = 'content'>\n");
      out.write("            <br>\n");
      out.write("            <h1> WELCOME TO TASTY BURGERS DELIVERY SYSTEM</h1>\n");
      out.write("            <article>\n");
      out.write("                    We offer you the best burger you can think of and we deliver it straight to your door step. Please make sure you order right now\n");
      out.write("            </article>\n");
      out.write("            <h4> Please login to order</h4>\n");
      out.write("        <div  id=\"content2\">\n");
      out.write("                <form name = \"LoginForm\" action= \"verification.jsp\" method = \"POST\">\n");
      out.write("                        <table border = \"0\">\n");
      out.write("                                <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <td>First Name</td>\n");
      out.write("                                                <td><input type=\"text\" name=\"name\" value=\"\" size=\"30\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <td>Password</td>\n");
      out.write("                                                <td><input type=\"password\" name=\"password\" value=\"\" size=\"30\"></td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                                <td></td>\n");
      out.write("                                                <td><input type=\"submit\" name=\"buttonname\" value=\"LOGIN\" id=\"btn\" ></td>\n");
      out.write("                                        </tr>\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                        </table>\n");
      out.write("                </form>\n");
      out.write("        </div>        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>Copyright &COPY; 2015 by CU JavaProgrammingTeam :)</footer>\n");
      out.write("    </body>\n");
      out.write("</html>-->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title> Available burgers</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/bootstrap3/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/gsdk.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/demo.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/assets/css/my-styles.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("/*                @import url(\"css.css\");*/\n");
      out.write("                @import url(\"resources/bootstrap3/css/bootstrap.min.css\");\n");
      out.write("                @import url(\"resources/assets/css/gsdk.css\");\n");
      out.write("                @import url(\"resources/assets/css/my-styles.css\");\n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("                @import url(\"resources/jquery/jquery-1.10.2.js\")\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:white;\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    <div class=\"container-fluid\" class=\"col-md-12\">\n");
      out.write("        <nav class= \"navbar navbar-ct-orange navbar-fixed-top navbar-transparent\" role = \"navigation\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div style=\"color: black;\" class= \"container\">\n");
      out.write("                <div id=\"bs-example-navbar-collapse-1\" class=\"collapse navbar-collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                      <li style=\"color: #000000;\"><a href=\"#\">Home</a></li>\n");
      out.write("\n");
      out.write("                      <li style=\"color: #000000;\"><a href=\"#section1\" class=\"\"> Sign in</a></li>\n");
      out.write("\n");
      out.write("                      <li style=\"color: #000000;\"><a href=\"#section2\">Register</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- header conten -->\n");
      out.write("        <div style=\"position: relative; text-align: center;\" >\n");
      out.write("            <img class=\"img-responsive\" src=\"img\\hdBurger1.jpg\" alt=\"\">\n");
      out.write("            <div class=\"row header-content\">\n");
      out.write("                <header>ARE YOU HUNGRY</header>\n");
      out.write("                <h1 class=\"subtitle\">Get ready for a Burger Experience </h1>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- end of header content -->\n");
      out.write("\n");
      out.write("        <!-- login section -->\n");
      out.write("        <div id=\"section1\" class=\"row section-body\" >\n");
      out.write("\n");
      out.write("            <div class=\"col-xs-4\"><br></div>\n");
      out.write("            <div class=\"col-xs-4 form-control-feedback text-center\">\n");
      out.write("                <h2>SIGN IN</h2>\n");
      out.write("                    \n");
      out.write("                <form action=\"verification.jsp\" class = \"form-group form-horizontal\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Username</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control input-xs\" placeholder=\"Enter Username\" name=\"username\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Password</label>\n");
      out.write("                        <input type=\"Password\" id=\"login-password\" class=\"form-control input-xs\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("                        \n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"pull-left ct-azzure \">\n");
      out.write("                            <input type=\"checkbox\" onclick=\"MakePasswordVisible(this, 'login-password');\"> Show Password\n");
      out.write("                        </label> \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <!-- <button class=\"btn btn-round btn-fill btn-warning\">Log in</button> -->\n");
      out.write("                        <input class=\"btn btn-round btn-fill btn-warning\" type=\"submit\" name=\"loginBtn\" value=\"Login\" id=\"btn\" >\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <button class=\"btn btn-default col-xs-12\" target=\"#section2\"><a href=\"#section2\">No account? Register Below</a></button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\"><br></div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- end of login section -->\n");
      out.write("        \n");
      out.write("        <!-- registration section -->\n");
      out.write("        <div id=\"section2\" class=\"row section-body\">\n");
      out.write("            <div class=\"col-xs-4\"><br></div>\n");
      out.write("            <div class=\"col-xs-4 form-control-feedback text-center\">\n");
      out.write("                <h2>REGISTER</h2>\n");
      out.write("                <form action=\"insertdata.jsp\" class=\"form-group form-horizontal\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Firstname</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control input-xs\" placeholder=\"Enter Firstname\" name=\"firstname\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Lastname</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control input-xs\" placeholder=\"Enter Lastname\" name=\"lastname\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Username</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control input-xs\" placeholder=\"Enter Username\" name=\"username\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Password</label>\n");
      out.write("                        <input type=\"password\" id=\"registration-password\" class=\"form-control input-xs\" placeholder=\"Enter Password\" name=\"password\">\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <label class=\"pull-left ct-azzure\">\n");
      out.write("                            <input type=\"checkbox\" onclick=\"MakePasswordVisible(this, 'login-password');\"\n");
      out.write("                             > Show Password\n");
      out.write("                        </label>                        \n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Address</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control input-xs\" placeholder=\"Where do you live\" name=\"address\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Phone Number</label>\n");
      out.write("                        <input type=\"number\" class=\"form-control input-xs\" placeholder=\"Enter phone number\" name=\"phonenumber\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label class=\"pull-left\">Sex</label>\n");
      out.write("                        <label class= \"col-sm-4\">\n");
      out.write("                        <input type=\"radio\" name=\"sex\"  id=\"optionsRadio1\" value=\"male\">\n");
      out.write("                        Male\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                        <label class= \"col-sm-4\">\n");
      out.write("                        <input type=\"radio\" name=\"sex\"  id=\"optionsRadio2\" value=\"female\">\n");
      out.write("                        Female\n");
      out.write("                        </label>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                        <!-- <button class=\"btn btn-round btn-fill btn-warning\">Log in</button> -->\n");
      out.write("                        <input class=\"btn btn-round btn-fill btn-warning\" type=\"submit\" name=\"registerBtn\" value=\"Register\" id=\"btn\" >\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-4\"><br></div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    /*\n");
      out.write("    * makes password field visible or hidden\n");
      out.write("    */\n");
      out.write("    function MakePasswordVisible(checkbox, id_of_password_input) {\n");
      out.write("        //get the password input box\n");
      out.write("        var password = document.getElementById(id_of_password_input);\n");
      out.write("\n");
      out.write("        if (checkbox.checked) {\n");
      out.write("            //make password visible\n");
      out.write("            password.setAttribute('type', 'text');\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            //hide password\n");
      out.write("            password.setAttribute('type', 'password');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    $(':radio').radio();\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("    <script src=\"resources/bootstrap3/js/bootstrap.js\"> </script>\n");
      out.write("    <script src=\"resources/jquery/jquery-1.10.2.js\"></script>\n");
      out.write("    <script src=\"resources/assets/js/jquery-ui-1.10.4.custom.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"resources/bootstrap3/js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"resources/assets/js/gsdk-checkbox.js\"></script>\n");
      out.write("    <script src=\"resources/assets/js/gsdk-radio.js\"></script>\n");
      out.write("    <script src=\"resources/assets/js/gsdk-bootstrapswitch.js\"></script>\n");
      out.write("    <script src=\"resources/assets/js/get-shit-done.js\"></script>\n");
      out.write("\n");
      out.write("</html>");
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
