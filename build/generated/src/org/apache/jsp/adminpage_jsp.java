package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"D:\\php\\stand.css\" media=\"all\"/>\n");
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
      out.write("\n");
      out.write("nav {\n");
      out.write("    float: left;\n");
      out.write("    max-width: 160px;\n");
      out.write("    margin: 20;\n");
      out.write("    padding: 1em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("nav ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("   \n");
      out.write("nav ul a {\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
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
      out.write("    <a>\n");
      out.write("    <img src=\"photo\\download.jpg\" align=left width=100></img>\n");
      out.write("<h3>Welcome to </h3>\n");
      out.write("<h1>PhD Portal USICT</h1>\n");
      out.write("</a></header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"cont\">\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<article>\n");
      out.write("\n");
      out.write("<h2><u><b>Teacher Add</b></u></h2>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("<form action='submit_teacher.jsp' method='post' name=\"frm\">\n");
      out.write("                               \n");
      out.write("    <table border='0'>\n");
      out.write("   \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;'>First Name</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"><input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Your name..\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'>Last Name</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\">  <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Your last name..\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("         <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'>Teacher Id</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"><input type=\"text\" id=\"fname\" name=\"id\" placeholder=\"Teacher Id..\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'>Password</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"><input type=\"text\" id=\"fname\" name=\"pwd\" placeholder=\"Teacher pwd\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'>Gender</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"><select id=\"gender\" name=\"gender\">\n");
      out.write("          <option value=\"male\">Male</option>\n");
      out.write("          <option value=\"female\">Female</option>\n");
      out.write("          <option value=\"other\">Other</option>\n");
      out.write("        </select>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'>Phone No</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"> <input type=\"text\" id=\"admin phone\" name=\"phone\" placeholder=\"Your Phone no..\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;;'></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td style='width:1000px;'></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"></td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        <tr style='height: 20px;'>\n");
      out.write("            <td class=\"col-75\"><input type=\"submit\" value=\"Submit\"></td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("</article>\n");
      out.write("<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
