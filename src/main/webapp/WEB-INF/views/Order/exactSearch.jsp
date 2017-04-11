<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
  <head>
  <META http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css" rel="stylesheet">

  
    <title>Welcome to our Transportation Management System</title>
    <style type='text/css'>
      body {
        background-color: #CCC;
      }
    </style>
    
  </head>
  
  <body>
  
<div class ="container">
<h1>Transportation Management System</h1>

<div class='navbar  navbar-inverse'>
  <div class='nav-collapse' style="height: auto;">
   <ul class="nav">
      <li class="active"><a href="Order">Main Page</a></li>
      <li><a href="beginstu">User Info</a></li>
      <li><a href="Trackinfo">Track Info</a></li>
      <li><a href="warehouse">Warehouse Info</a></li>
       <li><a href="Order">Order info together</a></li>
       <li><a href="product">Product Info</a></li>
       <li><a href="getIn">Logout</a></li>
    </ul>
  </div>
</div>	

<div id='content' class='row-fluid'>
  <div class='span9 main'>
  
 <h1> Welcome to the page of the Delivery Status Transfer, We Will Try our best to offer you our best Service</h1>
  
  
  




  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>Search Engine</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    
 <form action="searchResult" method="post">
	<input type="text" name="ID" >  
	
	<input type="submit" value="click">
	<br/>	
</form>

		







    
  </div>
</div>	



</div>
  
  
  
  

  </body>
</html>


