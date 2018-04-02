
<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*" import="java.sql.*" import="java.util.*" %>

<!DOCTYPE html>

<html>
<head><title>PhD Portal</title>
<link rel="stylesheet" href="style\stand.css" media="all"/>
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
</style>
<body>
<div class="container4">

<header>
<img src="photo\download.jpg" align=left width=100></img>
<h3>Welcome to </h3>
<h1>PhD Portal USICT</h1>
</a></header>





<div class="container">
  

    
     <%
                   
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
                    String sql="insert into teacher values('"+firstname+"','"+lastname+"','"+id+"','"+pwd+"','"+gender+"','"+phone+"')";
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
                    
                        <% out.println("Data Submitted Succesfull"); %><br>
                        <a href="adminpage.jsp">add more</a><br>
                        <a href="admin_index.jsp.jsp">Home</a><br>
                    </p>
                     
                    <% }
                    }
                    catch(Exception e)
                    {
                        out.println(e);
                    }
                       %>
                       
                       
                       
                       
                       
                       
                       

<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>


