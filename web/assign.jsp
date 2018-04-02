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





<h2 align="center"><u><b>Assign Teacher to Student</b></u></h2>

<div class="container">
  
<form action='submit_assign.jsp' method='post' name="frm">
                               
    <table border='0'>
   
        <tr style='height: 20px;'>
            <td style='width:1000px;'>Student Roll NO</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="text" id="fname" name="sid" placeholder="Student Roll NO"></td>
        </tr>
        
        
        <tr style='height: 20px;'>
            <td style='width:1000px;;'>Teacher Name</td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75">  <input type="text" id="lname" name="tid" placeholder="teacher ID"></td>
        </tr>
  
        <tr style='height: 20px;'>
            <td class="col-75"></td>
        </tr>
        
        <tr style='height: 20px;'>
            <td class="col-75"><input type="submit" value="Submit"></td>
        </tr>
            
      
            
    </table>
</form>
<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

