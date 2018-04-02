<%-- 
    Document   : adminpage
    Created on : Mar 7, 2018, 1:19:57 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<h2><u><b>Student Add</b></u></h2>

<div class="container">
  
<form action='submit_student.jsp' method='post' name="frm">
                               
    <table border='0'>
   
        <tr style='height: 20px;'>
            <td style='width:1000px;'>First Name</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="text" id="fname" name="firstname" placeholder="Your name.."></td>
        </tr>
        
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'>Last Name</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75">  <input type="text" id="lname" name="lastname" placeholder="Your last name.."></td>
        </tr>
        
         <tr style='height: 20px;'>
            <td style='width:1000px;;'>Roll No</td>
        </tr>
        
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="text" id="fname" name="id" placeholder="Roll No.."></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'>Password</td>
        </tr>
        
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="text" id="fname" name="pwd" placeholder="Student pwd"></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'>Gender</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"><select id="gender" name="gender">
          <option value="male">Male</option>
          <option value="female">Female</option>
          <option value="other">Other</option>
        </select>
            </td>
        </tr>
        
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'>Phone No</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"> <input type="text" id="admin phone" name="phone" placeholder="Your Phone no.."></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'></td>
        </tr>
        <tr style='height: 20px;'>
            <td style='width:1000px;'></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="submit" value="Submit"></td>
        </tr>
            
    </table>
</form>
</article>
<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

