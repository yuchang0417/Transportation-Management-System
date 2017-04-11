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
      <li class="active"><a href="#">Main Page</a></li>
      
       <li><a href="findOrder">Find your Order info</a></li>
       
       <li><a href="getIn">Logout</a></li>
    </ul>
  </div>
</div>	

<div id='content' class='row-fluid'>
  <div class='span9 main'>
  
   
<table class="table table-bordered">
 
 <tr><td colspan=3>Order</td>
<tr><td>orderInfomation </td>      </tr>
<c:forEach items="${Orders}" var="Account">
<tr><td><a href="displayorder?id=${ Account.getOrderId()}">${ Account.getOrderId()} is the number of your order </a>  </td> </tr>
 <tr> <td>The Sender's Name  : ${ Account.getSender().getUser().getUserFirstName()} ${ Account.getSender().getUser().getUserLastName()} </td>  </tr>
  <tr> <td>The Receiver's Name : ${ Account.getReceiver().getUser().getUserFirstName()}  ${ Account.getReceiver().getUser().getUserLastName()}</td>  </tr>
   <tr> <td>The Contact Info of Receiver : ${ Account.getReceiver().getUser().getUserPhone()}</td>  </tr>
  
 <tr> <td>The Date Begin Transaction : ${ Account.getOrderDate()}</td>  </tr>
 <tr>   <td>The product send from :${Account.getSender().getUser().getUserStreet()}</td> </tr>
 <tr>  <td>The product will be send to (${Account.getReceiver().getUser().getUserStreet()} )</td></tr>
 <tr>  <td>The product now arrving (${Account.getTrackinfo().getStatus()} )</td></tr>
  </c:forEach>

</table>

<h3> Destination</h3>
<div id="map">

<c:forEach items="${map1}" var="Maps">
<img src="${Maps}">
</c:forEach>
</div>

<h3> Destination</h3>
<c:forEach items="${map3}" var="Maps">
<img src="${Maps}">
</c:forEach>
</div>
 
  

<h3> Now Arriving</h3>
<div id="map2">

<c:forEach items="${map2}" var="Maps">
<img src="${Maps}">
</c:forEach>
</div>
<div id="map2">

  

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
