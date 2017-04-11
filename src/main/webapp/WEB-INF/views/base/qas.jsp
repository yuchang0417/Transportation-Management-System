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
      <li><a href="beginstu">product Info</a></li>
      <li><a href="Trackinfo">Track Info</a></li>
      <li><a href="warehouse">Warehouse Info</a></li>
    </ul>
  </div>
</div>	

<div id='content' class='row-fluid'>
  <div class='span9 main'>
  
  
  
  
  

<h2>Managers</h2>
		
			<table>
				<c:forEach items="${ManagerList}" var="Manager" varStatus="status" >
					
					<c:if test="${status.last}">
					<tr>
						<td>
					  <img src="${Manager.getManagerId()}/photo1" height="100" width="100" />
						</td>
						<td>${Manager.getManagerName()}</td>
					
						</tr>
						<tr><td> Your logging ID for this website will be ${Manager.getManagerId()} </td></tr>
						
						<tr><td> Your Contact Email is ${Manager.getManagerEmail()}</td></tr>
						
						<p>${Manager.getDescribtion()}</p>
						</c:if>
						
				</c:forEach>
			</table>
	




  </div>
  
  
  
  
  
  <div class='span3 sidebar'>
    <h2>product Manager</h2>
    <p>
<a href="#" class="btn btn-primary btn-lg active" role="button">Exact Search</a>

    </p>
 


    
  </div>
</div>	



</div>
  
  
  
  

  </body>
