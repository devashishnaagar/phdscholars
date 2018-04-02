<%-- 
    Document   : admin_index
    Created on : Mar 7, 2018, 12:59:21 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*" import="java.sql.*" import="java.util.*" %>
<!DOCTYPE html>

<html>
<head><title>PhD Portal</title>
<link rel="stylesheet" href="style\stand.css" media="all"/>
<style>

label {
    padding: 12px 12px 12px 0;
    display: inline-block;
}


.container {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
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
.button {
  display: inline-block;
  padding: 20px 55px;
  font-size: 24px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<body>
<div class="container4">

<header>
<img src="photo/download.jpg" align=left width=100></img>
<h3>Welcome to </h3>
<h1>PhD Portal USICT</h1>
</a></header>

    <%
    String nm=(String)session.getAttribute("logid");
    String id=(String)session.getAttribute("logname");
    %>
    
    <p style="text-align:right; font-size: 20px; color:#ff3300; "><%=nm%> &nbsp;&nbsp;&nbsp;</p> 
    <p style="text-align:right;"><%=id%> &nbsp;&nbsp;&nbsp;</p> 
     <p style="text-align:right;">USICT, IP University  &nbsp;&nbsp;&nbsp;</p>
      
<p align="center">
<br><br><br><br><br>



   <%
       String sid=request.getParameter("roll");
       String pdf=request.getParameter("pdf");
       String des=request.getParameter("des");
   
   %>            
   
<center>
<h3>Remark on <%=pdf%> of <%=sid%></h3>

 <%
                   
                    try
                    {
                   
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="insert into remark values('"+sid+"','"+pdf+"','"+des+"')";
                    int a=stmt.executeUpdate(sql);
                    if(a<0)
                    {  %>
                    
                    <p style="text-align: center; color:#000000; font-size: 30px; font-family: cursive;">
                    
                        <% out.println("OOPS! An Error Occur During Submittion Of Data"); %>
                    
                    </p>
                     
                    <%}
                    else
                    { %>
                    
                    <p style="text-align: center; color:#000000; font-size: 30px; font-family: cursive;">
                    
                        <% out.println("Remark Submitted Succesfully"); %>
                        <br><br> <a href="teacher_home.jsp"> Back</a>
                        
                    </p>
                     
                    <% }
                    }
                    catch(Exception e)
                    {
                        out.println(e);
                    }
                       %>
                       

</center>




<br><br><br><br><br>
</p>


<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

