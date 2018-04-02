<%-- 
    Document   : admin_index
    Created on : Mar 7, 2018, 12:59:21 PM
    Author     : DEVASHISH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

<p align="center">
<br><br><br><br><br>
<button class="button" onclick="document.location.href='adminpage.jsp'">Manage Teachers</button><br>
<br><br><br><br>
<button class="button" onclick="document.location.href='add_student.jsp'">Manage Students</button>
<br><br><br><br><br>
<button class="button" onclick="document.location.href='assign.jsp'">Assign teacher</button>
<br><br><br><br><br>
</p>


<footer>Copyright &copy; USICT Guru Gobind Singh Indraprastha University</footer>
</div>

</body>
</html>

