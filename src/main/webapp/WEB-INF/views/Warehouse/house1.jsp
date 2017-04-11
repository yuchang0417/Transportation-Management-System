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
      <li><a href="beginstu">User Info</a></li>
      <li><a href="Trackinfo">Track Info</a></li>
      <li><a href="warehouse">Warehouse Info</a></li>
    </ul>
  </div>
</div>	

<div id='content' class='row-fluid'>
  <div class='span9 main'>
  
  
  
  
  
<table class="table table-bordered">
 
 <tr><td colspan=3>Warehouse</td>
<tr><td>warehouseId</td>       <td>warehouseAddress</td>  <td>warehouseZip</td>
<c:forEach items="${WarehouseList}" var="Account">
<tr><td><a href="searchhouse?id=${Account.warehouseId}">${Account.warehouseId}</a></td><td>${Account.warehouseAddress }</td><td>(${Account.warehouseZip} )</td>
  </c:forEach>
 
</table>




  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>User Manager</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>
    
    
   <div class="span-12 last">	
		<form:form modelAttribute="Warehouse" action="addhouse" method="post" enctype="multipart/form-data">
		  	<fieldset>		
				<legend>warehouse Fields</legend>
				<p>
					<form:label	for="warehouseId" path="warehouseId" cssErrorClass="error">warehouseId:</form:label><br/>
					<form:input path="warehouseId" /> <form:errors path="warehouseId" />			
				</p>
				
				<p>
				<form:label for="warehouseAddress" path="warehouseAddress" cssErrorClass="error">warehouseAddress:</form:label><br/>
					<form:input path="warehouseAddress" /> <form:errors path="warehouseAddress" />
				</p>
				<p>
				<form:label for="warehouseZip" path="warehouseZip" cssErrorClass="error">warehouseZip:</form:label><br/>
					<form:input path="warehouseZip" /> <form:errors path="warehouseZip" />
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