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



<center>
<h3>Research Material List</h3>


     <%
                   
                    try
                    {
                    //java.sql.Date d = new java.sql.Date(new java.util.Date().getTime());
                   String sid=request.getParameter("id");
                    
                            out.println(sid);
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="select * from upload where studentname='"+sid+"' ";
                      ResultSet rs=stmt.executeQuery(sql);
                    
                    int i=0;
                    %>
<table >
                    <%
                    while(rs.next())
                    { i=1;
                     %>
                     <tr style="height: 100px;">
                         <td style="width: 100px;"><a href="Upload\<%=rs.getString(3)%>" target="new" style="font-size: 24px;"><%=rs.getString(3)%></a>
                         
                             <form action="remark.jsp" method="post">
                                 <input type="hidden" name="roll" value="<%=sid%>">
                                 <input type="hidden" name="pdf" value="<%=rs.getString(3)%>">
                                 <br><center><input type="submit" value="Remark"/></center>
                             </form>
                         </td>
                     </tr>
                     <tr style="height: 20px;"></tr>
                    <%
                    }
                    %>
</table>                
    <%
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

