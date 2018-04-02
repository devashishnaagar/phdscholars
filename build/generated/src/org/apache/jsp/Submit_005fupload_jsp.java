package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;

public final class Submit_005fupload_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String sid,tid;
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
      out.write("<nav class=\"cont\">\n");
      out.write("LOGIN\n");
      out.write("\n");
      out.write("  <ul>\n");
      out.write("    <li><a href=\"D:\\php\\admin.html\">Admin</a></li>\n");
      out.write("    <li><a href=\"D:\\php\\teacher.html\">Teacher</a></li>\n");
      out.write("    <li><a href=\"D:\\php\\student.html\">Student</a></li>\n");
      out.write("<a href=\"D:\\php\\new 2.html\">Homepage</a>  \n");
      out.write("</ul>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<article>\n");
      out.write("\n");
      out.write("<h2><u><b>Upload Submit</b></u></h2>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      out.write("\n");
      out.write("    \n");
      out.write("            \n");
      out.write("    \n");
      out.write("     ");

            sid=(String)session.getAttribute("logname");        
                     
                       //////// change this code according to your database///////////
                 ////////////////////////////////////////////////////////////////////////////////////////////////////
                 try {
                                       
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="select * from assign where student='"+sid+"' ";
                    ResultSet rs=stmt.executeQuery(sql);
                    
                   while(rs.next())
                    { 
                       tid=rs.getString(2);
                    }
                     }
                     catch(Exception e)
                     {  }
                     
                     ///////////////////////////////////////////////////////////////////////////////////////////////////
                   
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");

           
   File file ;
  
   int maxFileSize = 5000 * 1024;
   int maxMemSize = 5000 * 1024;
   ServletContext context = pageContext.getServletContext();
            
                        /* Photo Store at that Folder Liocation. change according to your*/
    String filePath = "C:/Users/DEVASHISH/Documents/NetBeansProjects/WebApplication1/web/Upload/";
   
   // Verify the content type
   String contentType = request.getContentType();
   
   if ((contentType.indexOf("multipart/form-data") >= 0)) {
      DiskFileItemFactory factory = new DiskFileItemFactory();
      // maximum size that will be stored in memory
      factory.setSizeThreshold(maxMemSize);
      
      // Location to save data that is larger than maxMemSize.
      factory.setRepository(new File("c:\\temp"));

      // Create a new file upload handler
      ServletFileUpload upload = new ServletFileUpload(factory);
      
      // maximum file size to be uploaded.
      upload.setSizeMax( maxFileSize );
      
      try { 
         // Parse the request to get file items.
         List fileItems = upload.parseRequest(request);

         // Process the uploaded file items
         Iterator i = fileItems.iterator();

         while ( i.hasNext () ) {
            FileItem fi = (FileItem)i.next();
            if ( !fi.isFormField () ) {
               // Get the uploaded file parameters
               String fieldName = fi.getFieldName();
               String fileName = fi.getName();
               boolean isInMemory = fi.isInMemory();
               long sizeInBytes = fi.getSize();
            
               // Write the file
               if( fileName.lastIndexOf("\\") >= 0 ) {
                  file = new File( filePath + fileName.substring( fileName.lastIndexOf("\\"))) ;
                 fi.write( file ) ;
                 
                                    //////// change this code according to your database///////////
                 ////////////////////////////////////////////////////////////////////////////////////////////////////
                 try {
                                       
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="insert into upload values('"+sid+"','"+tid+"','"+fileName+"') ";
                    int a=stmt.executeUpdate(sql);
                    ResultSet rs=stmt.executeQuery(sql);
                    
                   /*ResultSet rs=stmt.executeQuery(sql);
                    
                   while(rs.next())
                    { }
                    */ 
                   }
                     catch(Exception e)
                     { out.println(e);}
                 //////////////////////////////////////////////////////////////////////////////////////////////////////
                 
                 
                 
                 
               } 
               else {
                 file = new File( filePath + fileName.substring(fileName.lastIndexOf("\\")+1)) ;
                 fi.write( file ) ;
                 
                                        ////////change this code according to your database///////////
                 ///////////////////////////////////////////////////////////////////////////////////////////////////////
                 
                 try {
                                       
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    
                    String sql="insert into upload values('"+sid+"','"+tid+"','"+fileName+"')";
                    int a=stmt.executeUpdate(sql);
                    /*ResultSet rs=stmt.executeQuery(sql);
                    
                   while(rs.next())
                    { }
                    */
                     }
                     catch(Exception e)
                     { out.println(e);}
                 
                 ///////////////////////////////////////////////////////////////////////////////////////////////////////
                 
                }
                }
                  }
               
         
      } catch(Exception ex) {
         System.out.println(ex);
      }
   } else {
   }

      out.write("\n");
      out.write("      \n");
      out.write("                  <p style=\"text-align: center; color:#000000; font-size: 30px; font-family: cursive;\">\n");
      out.write("                    \n");
      out.write("                        ");
 out.println("Your File Submitted");  
      out.write("\n");
      out.write("                   </p>\n");
      out.write("\n");
      out.write("    \n");
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
