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
      
    
       <li><a href="findOrder">Order info together</a></li>
       
       <li><a href="getIn">Logout</a></li>
    </ul>
  </div>
</div>	

<div id='content' class='row-fluid'>
  <div class='span9 main'>
  
  
  
  
  
<h2>Visitors</h2>
		
			<table>
				<c:forEach items="${VisitorList}" var="Visitor" varStatus="status" >
					
					<c:if test="${status.last}">
					<tr>
					
						<td>Welcoem to our website ${Visitor.getVisitorName()}</td>
					
						</tr>
						<tr><td> Your logging ID for this website will be ${Visitor.getVisitorId()} </td></tr>
						
						<tr><td> Your Contact Email is ${Visitor.getVisitorEmail()}</td></tr>
						<tr>
						
						
						</c:if>
						
				</c:forEach>
			</table>
	




  </div>
  
  
  
  
  
  
  </div>
</div>	



</div>
  
  
  
  

  </body>
</html>	