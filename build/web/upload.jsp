<%-- 
    Document   : adminpage
    Created on : Mar 7, 2018, 1:19:57 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*" import="java.sql.*" import="java.util.*" %>
<!DOCTYPE html>

<html>
<head><title>Welcome To PhD Portal USICT</title>
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
.button {
    background-color: #4CAF50; /* Green */
    border: none;
    color: white;
    padding: 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    transition-duration: 0.4s;
    transition-duration:0.4s;
}
.button1:hover {
    box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
</style>
<body>
<div class="container4">

<header>
<img src="photo\download.jpg" align=left width=100></img>
<h3>Welcome to </h3>
<h1>PhD Portal USICT</h1>
<p align="right"><button class="button button1">Logout</button></p>
</a></header>




    <center>
        <h2><u><b>Report Upload</b></u></h2></center>

<div class="container">
  

      
    <table align="center" border="1">
                    <tr style="height: 100px;">
                        <td style="width:800px; ">
                            <form action='Submit_upload.jsp' method='post' name="frm1" enctype="multipart/form-data" >
                            
                                <table border="0" style="border:0px;">
                                
                                <tr style="height: 100px; ">
                                    <td class="form_margin" > </td>
                                    <td class="form_data"> Upload File::</td>
                                    <td class="form_data">
                                        
                                        <input type="file" name="pdf" id="pdf" accept="application/pdf" > </td>
                              
                                    <td class="form_margin" > </td>
                                    <td class="form_data" style=" text-align: center;"> <input type="submit" class="btn" value="Submit"/></td>
                                    <td class="form_data"></td>
                                </tr>
                                
                               
                            </table>
                                </form>
                        </td>
                    </tr>
                </table>
    <br>
    
    
    
         <%
                   
                    try
                    {
                    //java.sql.Date d = new java.sql.Date(new java.util.Date().getTime());
                   String tid=(String)session.getAttribute("logname");
                    
                            
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="select * from remark where roll='"+tid+"' ";
                      ResultSet rs=stmt.executeQuery(sql);
                    
                    int i=0;
                    %>
<table border="1" align="center">
                    <tr style="height: 20px;">
                        <td style="width: 200px;" colspan="2"><font style="color:#ff3300; font-size: 28px;  ">Remark</font></td>
                     </tr>
                    <%
                    while(rs.next())
                    { i=1;
                     %>
                     <tr style="height: 20px;">
                         <td style="width: 200px;" style=""><font style=" font-size: 20px;  "><%=rs.getString(2)%></font></td>
                         <td style="width: 800px;"><font style="font-size: 20px;  "><%=rs.getString(3)%></font></td>
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
    
    
    
    
    <br><br><br><br><br><br><br><br><br><br><br><br>
<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

