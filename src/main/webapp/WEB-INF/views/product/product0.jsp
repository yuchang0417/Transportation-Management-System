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
  
  
   
<h2>products</h2>
		<c:if test="${!empty productList}">
			<table>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td>
							<img src="${product.getproductId()}/photo" height="60" width="60" />
						</td>
						<td>${product.getproductName()}</td>
						<td>${product.getproductType()}</td>
						<td><a href="#" id="${product.getproductId()}" onclick="deleteproduct(event)">Delete</a></td>
						
					</tr>
				</c:forEach>
			</table>
		</c:if>





  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
   <h2>product Manager</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>

    
    
  <div class="span-12 last">	
		<form:form modelAttribute="product" action="submitproduct" method="post" enctype="multipart/form-data">
		  	<fieldset>		
				<legend>product Fields</legend>
				
				<p>
					<form:label	for="productName" path="productName" cssErrorClass="error">ProductName:</form:label><br/>
					<form:input path="productName" /> <form:errors path="productName" />			
				</p>
				<p>	
					<form:label for="productType" path="productType" cssErrorClass="error">ProductType:</form:label><br/>
					<form:input path="productType" /> <form:errors path="productType" />
				</p>
				<p>
					<form:label for="photo" path="photo" cssErrorClass="error">product Photo:</form:label><br/>
					<form:input path="photo" type="file" /> <form:errors path="photo" />
				<p>	
					<input type="submit" />
				</p>
			</fieldset>
		</form:form>
		
		<div>

   
   
   
   
   
   
</div>







    
  </div>
</div>	



</div>
  
  
  
  

  </body>
</html>



</html>	