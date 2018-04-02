<%-- 
    Document   : adminpage
    Created on : Mar 7, 2018, 1:19:57 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.sql.*" import="java.io.*"%>
<%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
<%@ page import = "javax.servlet.http.*" %>
<%@ page import = "org.apache.commons.fileupload.*" %>
<%@ page import = "org.apache.commons.fileupload.disk.*" %>
<%@ page import = "org.apache.commons.fileupload.servlet.*" %>
<%@ page import = "org.apache.commons.io.output.*" %>
<!DOCTYPE html>

<html>
<head><title>PhD Portal</title>
<link rel="stylesheet" href="D:\php\stand.css" media="all"/>
<style>
* {
    box-sizing: border-box;
}

input[type=text], select, textarea{
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    resize: vertical;
}

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}

input[type=submit] {
    background-color: black;
    color: white;
    padding: 12px 20px;
    border: none;
    border-radius: 4px;
    cursor: pointer;
    float: left;
}

input[type=submit]:hover {
    background-color: Green;
color:black;
}

.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}

@media (max-width: 600px) {
    .col-25, .col-75, input[type=submit] {
        width: 100%;
        margin-top: 0;
    }
}
div.container4{
    width: 100%;
    border: 1px solid gray;
}

header{
    padding: 1em;
    color: white;
    background-color: black;
    clear: left;
    text-align: left;
}
footer{
    padding: 5em;
    color: white;
    background-color: black;
    clear: left;
    text-align: left;
}

nav {
    float: left;
    max-width: 160px;
    margin: 20;
    padding: 1em;
}

nav ul {
    list-style-type: none;
    padding: 0;
}
   
nav ul a {
    text-decoration: none;
}

.middle{
text-align:center;
}
article {
    margin-left: 170px;
    border-left: 1px solid gray;
    padding: 1em;
    overflow: hidden;
}
.form_margin
{
    width: 50px;
}
.form_data
{
    width: 200px;
    font-size: 20px;
    
}
</style>
<body>
<div class="container4">

<header>
<img src="photo\download.jpg" align=left width=100></img>
<h3>Welcome to </h3>
<h1>PhD Portal USICT</h1>
</a></header>


<nav class="cont">
LOGIN

  <ul>
    <li><a href="D:\php\admin.html">Admin</a></li>
    <li><a href="D:\php\teacher.html">Teacher</a></li>
    <li><a href="D:\php\student.html">Student</a></li>
<a href="D:\php\new 2.html">Homepage</a>  
</ul>
</nav>

<article>

<h2><u><b>Upload Submit</b></u></h2>

<div class="container">
  
    
    
    
    
    
    
    <%! String sid,tid;%>
    
            
    
     <%
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
                   %> 
    
    
    
    
    
    
    <%
           
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
%>
      
                  <p style="text-align: center; color:#000000; font-size: 30px; font-family: cursive;">
                    
                        <% out.println("Your File Submitted");  %>
                   </p>

    
</article>
<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

