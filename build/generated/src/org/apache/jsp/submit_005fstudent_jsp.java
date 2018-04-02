package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class submit_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head><title>PhD Portal</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"style\\stand.css\" media=\"all\"/>\n");
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], select, textarea{\n");
      out.write("    width: 100%;\n");
      out.write("    padding: 12px;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("    resize: vertical;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label {\n");
      out.write("    padding: 12px 12px 12px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit] {\n");
      out.write("    background-color: black;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    border: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=submit]:hover {\n");
      out.write("    background-color: Green;\n");
      out.write("color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    border-radius: 5px;\n");
      out.write("    background-color: #f2f2f2;\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media (max-width: 600px) {\n");
      out.write("    .col-25, .col-75, input[type=submit] {\n");
      out.write("        width: 100%;\n");
      out.write("        margin-top: 0;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("div.container4{\n");
      out.write("    width: 100%;\n");
      out.write("    border: 1px solid gray;\n");
      out.write("}\n");
      out.write("\n");
      out.write("header{\n");
      out.write("    padding: 1em;\n");
      out.write("    color: white;\n");
      out.write("    background-color: black;\n");
      out.write("    clear: left;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("footer{\n");
      out.write("    padding: 5em;\n");
      out.write("    color: white;\n");
      out.write("    background-color: black;\n");
      out.write("    clear: left;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write(".middle{\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write("article {\n");
      out.write("    margin-left: 170px;\n");
      out.write("    border-left: 1px solid gray;\n");
      out.write("    padding: 1em;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div class=\"container4\">\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("<img src=\"photo\\download.jpg\" align=left width=100></img>\n");
      out.write("<h3>Welcome to </h3>\n");
      out.write("<h1>PhD Portal USICT</h1>\n");
      out.write("</a></header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2><u><b>Submit Student Data</b></u></h2>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("    \n");
      out.write("     ");

                   
                    try
                    {
                    //java.sql.Date d = new java.sql.Date(new java.util.Date().getTime());
                    String firstname=request.getParameter("firstname");
                    String lastname=request.getParameter("lastname");
                    String id=request.getParameter("id");
                    String pwd=request.getParameter("pwd");
                    String gender=request.getParameter("gender");
                    String phone=request.getParameter("phone");
                    
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="insert into student values('"+firstname+"','"+lastname+"','"+id+"','"+pwd+"','"+gender+"','"+phone+"')";
                    int a=stmt.executeUpdate(sql);
                    if(a<0)
                    {  
      out.write("\n");
      out.write("                    \n");
      out.write("                    <p style=\"text-align: center; color:#000000; font-size: 30px; font-family: cursive;\">\n");
      out.write("                    \n");
      out.write("                        ");
 out.println("OOPS! An Error Occur During Submittion Of Data"); 
      out.write("\n");
      out.write("                    \n");
      out.write("                    </p>\n");
      out.write("                     \n");
      out.write("                    ");
}
                    else
                    { 
      out.write("\n");
      out.write("                    \n");
      out.write("                    <p style=\"text-align: center; color:#000000; font-size: 30px; font-family: cursive;\">\n");
      out.write("                    \n");
      out.write("                        ");
 out.println("Data Submitted Succesfull"); 
      out.write("\n");
      out.write("                    \n");
      out.write("                    </p>\n");
      out.write("                     \n");
      out.write("                    ");
 }
                    }
                    catch(Exception e)
                    {
                        out.println(e);
                    }
                       
      out.write("\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("\n");
      out.write("<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
