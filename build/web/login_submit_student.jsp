<%-- 
    Document   : login_submit_student
    Created on : Mar 14, 2018, 2:11:22 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java" import="java.io.*" import="java.sql.*" import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%!String nm,pw;%>
        <%
           
                    String roll=request.getParameter("roll");
                    String password=request.getParameter("pwd");
                   
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/phd_data", "root", "deva");
                    Statement stmt=con.createStatement();
                    String sql="select * from student where s_id='"+roll+"' and pwd='"+password+"'";
                    ResultSet rs=stmt.executeQuery(sql);
                    int f=0;
                    while(rs.next())
                    {
                        nm=rs.getString(3);
                        pw=rs.getString(4);
                        f++;
                    }
            
        
                    if(f>0)
                    {
                        session.setAttribute("logname", nm);
                        session.setAttribute("password", pw);
                    %>
                    <jsp:forward page="upload.jsp" />
                    <%
                    }
                    else {
                        %>
                     <jsp:forward page="login_submit_student.jsp" />
                     <%
                    }
                    
            %>
    </body>
</html>
