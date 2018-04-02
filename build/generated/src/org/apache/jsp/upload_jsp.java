package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class upload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head><title>Welcome To PhD Portal USICT</title>\n");
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
      out.write(".form_margin\n");
      out.write("{\n");
      out.write("    width: 50px;\n");
      out.write("}\n");
      out.write(".form_data\n");
      out.write("{\n");
      out.write("    width: 200px;\n");
      out.write("    font-size: 20px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write(".button {\n");
      out.write("    background-color: #4CAF50; /* Green */\n");
      out.write("    border: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("    cursor: pointer;\n");
      out.write("    transition-duration: 0.4s;\n");
      out.write("    transition-duration:0.4s;\n");
      out.write("}\n");
      out.write(".button1:hover {\n");
      out.write("    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("<div class=\"container4\">\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("<img src=\"photo\\download.jpg\" align=left width=100></img>\n");
      out.write("<h3>Welcome to </h3>\n");
      out.write("<h1>PhD Portal USICT</h1>\n");
      out.write("<p align=\"right\"><button class=\"button button1\">Logout</button></p>\n");
      out.write("</a></header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h2><u><b>Student Upload</b></u></h2></center>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("\n");
      out.write("      \n");
      out.write("    <table align=\"right\" border=\"0\">\n");
      out.write("                    <tr style=\"height: 100px;\">\n");
      out.write("                        <td style=\"width:800px; \">\n");
      out.write("                            <form action='Submit_upload.jsp' method='post' name=\"frm1\" enctype=\"multipart/form-data\" >\n");
      out.write("                            \n");
      out.write("                                <table border=\"0\" style=\"border:0px;\">\n");
      out.write("                                \n");
      out.write("                                <tr style=\"height: 100px; \">\n");
      out.write("                                    <td class=\"form_margin\" > </td>\n");
      out.write("                                    <td class=\"form_data\"> Upload File::</td>\n");
      out.write("                                    <td class=\"form_data\">\n");
      out.write("                                        \n");
      out.write("                                        <input type=\"file\" name=\"pdf\" id=\"pdf\" accept=\"application/pdf\" > </td>\n");
      out.write("                              \n");
      out.write("                                    <td class=\"form_margin\" > </td>\n");
      out.write("                                    <td class=\"form_data\" style=\" text-align: center;\"> <input type=\"submit\" class=\"btn\" value=\"Submit\"/></td>\n");
      out.write("                                    <td class=\"form_data\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("                            </table>\n");
      out.write("                                </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                   \n");
      out.write("    <br><br><br><br><br><br><br><br><br><br><br><br>\n");
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
