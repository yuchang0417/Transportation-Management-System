<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
  <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.0/css/bootstrap-combined.min.css" rel="stylesheet">

  
    <title>
    Warehouse Info 
    
    </title>
    <style type='text/css'>
      body {
        background-color: #CCC;
      }
    </style>
<style>
      #map {
        width: 500px;
        height: 400px;
      }
    </style>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
  
  
  
  
  

<table>

<tbody>
<c:forEach items="${Trackinfos}" var="Account">
<div>
<ul class="nav nav-tabs nav-stacked">
   
<li><a href="deletehouse?id=${Account.trackId}">Delete</a></li>



<li><a href="searchhouse?id=${Account.trackId}">Here is Tracking Info</a></li>

<li> TrackDate: ${Account.trackDate} </li>
<li> Item's current Position:${Account.status} </li>
 </ul>

</div>

<div>
<div id="map">

<c:forEach items="${map}" var="Maps">
<img src="${Maps}">
</c:forEach>
</div>




</div>

</c:forEach>
</tbody>
</table>





  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>Warehouse Manager</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>
   <div class="span-12 last">	
		<form:form modelAttribute="Trackinfo" action="Trackinfo" method="post" enctype="multipart/form-data">
		  	<fieldset>		
				<legend>track Fields</legend>
				<p>
					<form:label	for="trackId" path="trackId" cssErrorClass="error">trackId:</form:label><br/>
					<form:input path="trackId" /> <form:errors path="trackId" />			
				</p>
				<p>	
					<form:label for="trackDate" path="trackDate" cssErrorClass="error">trackDate:</form:label><br/>
					<form:input path="trackDate" /> <form:errors path="trackDate" />
				</p>
				
				<p>
				<form:label for="status" path="status" cssErrorClass="error">status:</form:label><br/>
					<form:input path="status" /> <form:errors path="status" />
				</p>	
				
				<p>	
					<input type="submit" />
				</p>
			</fieldset>
		</form:form>
		

</div>




    
  </div>
</div>	



</div>
  
  
  
  

  </body>

</html>
