package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public final class login_005fsubmit_005fteacher_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String nm,pw,id2;
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("\n");
      out.write("        ");

           
                    String id=request.getParameter("id");
                    String password=request.getParameter("pwd");
                   
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="select * from teacher where t_id='"+id+"' and pwd='"+password+"'";
                    ResultSet rs=stmt.executeQuery(sql);
                    int f=0;
                    while(rs.next())
                    {
                         id2=rs.getString(1);
                        nm=rs.getString(3);
                        pw=rs.getString(4);
                        f++;
                    }
            
        
                    if(f>0)
                    {
                         session.setAttribute("logid", id2);
                         session.setAttribute("logname", nm);
                        session.setAttribute("password", pw);
                    
      out.write("\n");
      out.write("                    ");
      if (true) {
        _jspx_page_context.forward("teacher_home.jsp");
        return;
      }
      out.write("\n");
      out.write("                    ");

                    }
                    else {
                        
      out.write("\n");
      out.write("                     ");
      if (true) {
        _jspx_page_context.forward("login_teacher.jsp");
        return;
      }
      out.write("\n");
      out.write("                     ");

                    }
                    
            
      out.write("\n");
      out.write("    </body>\n");
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
