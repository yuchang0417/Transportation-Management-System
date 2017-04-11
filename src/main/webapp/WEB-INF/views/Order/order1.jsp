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
  
  
  
  
  
<table class="table table-bordered">
 
 <tr><td colspan=3>Order</td>
<tr><td>orderId</td>       <td>orderDate</td>  <td>Send From</td> <td>Status</td> <td>Send To</td> <
<c:forEach items="${OrderList}" var="Account">
<tr><td><a href="displayorder?id=${ Account.getOrderId()}">${ Account.getOrderId()} </a>  </td> <td>${ Account.getOrderDate()}</td><td>${Account.getSender().getUser().getUserStreet()}</td><td>(${Account.getReceiver().getUser().getUserStreet()} )</td><td>(${Account.getReceiver().getUser().getUserStreet()} )</td>
  </c:forEach>

</table>




  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>User Manager</h2>
    <p>
<a href="exactSearch" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>
    
    
   <h2>Side Bar</h2>
		
   <p>   The whole order will generated here, you can check it whenever you need the latest information</p>
</div>







    
  </div>
</div>	



</div>
  
  
  
  

  </body>
</html>



