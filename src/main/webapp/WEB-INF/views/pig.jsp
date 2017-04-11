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
  
  
  
  
  
 <ul class="nav nav-tabs nav-stacked">
   
 <c:forEach items="${UserList}" var="Account">
<li><a href="showStudent?id=${Account.userId}">${Account.userFirstName}  ${Account.userLastName }  (${Account.userEmail} )</a></li>
</c:forEach>
 </ul>





  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>User Manager</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>
   <div class="span-12 last">	
		<form:form modelAttribute="User" action="pigg" method="post" enctype="multipart/form-data">
		  	<fieldset>		
				<legend>User Fields</legend>
				<!--<p>
					<form:label	for="userId" path="userId" cssErrorClass="error">userId:</form:label><br/>
					<form:input path="userId" /> <form:errors path="userId" />			
				</p>-->
				<p>	
					<form:label for="userFirstName" path="userFirstName" cssErrorClass="error">userFirstName:</form:label><br/>
					<form:input path="userFirstName" /> <form:errors path="userFirstName" />
				</p>
				<p>
					<form:label for="userLastName" path="userLastName" cssErrorClass="error">userLastName:</form:label><br/>
					<form:input path="userLastName" /> <form:errors path="userLastName" />
					</p>
				<p>
				<form:label for="userEmail" path="userEmail" cssErrorClass="error">userEmail:</form:label><br/>
					<form:input path="userEmail" /> <form:errors path="userEmail" />
				</p>	
				<p>
				<form:label for="userPhone" path="userPhone" cssErrorClass="error">userPhone:</form:label><br/>
					<form:input path="userPhone" /> <form:errors path="userPhone" />
				</p>
				<p>
				<form:label for="userStreet" path="userStreet" cssErrorClass="error">userStreet:</form:label><br/>
					<form:input path="userStreet" /> <form:errors path="userStreet" />
				</p>
				<p>
				<form:label for="userzip" path="userzip" cssErrorClass="error">userzip:</form:label><br/>
					<form:input path="userzip" /> <form:errors path="userzip" />
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