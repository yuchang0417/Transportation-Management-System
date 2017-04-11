<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>


<head>
<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
   
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Welcome to The TMA Manage System</title>

<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Please Entering your information</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav">
      <li class="active"><a href="#">Entering your Information</a></li>
      
    </ul>
        
          <form class="navbar-form navbar-right" action="loginsubmit" method="post">
            <div class="form-group">
              <input name ="LoginID" type="text" placeholder="LoginID" class="form-control">
            </div>
            
            
            <div class="form-group">
              <input name="password" type="password" placeholder="Password" class="form-control">
            </div>
            
             <select name="userType">
	        <option>--userType--</option>
	         <option value="visitor">visitor</option>
	         <option value="user">User</option>
	         </select>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
	  
	  
      <div class="span-12 last">	
		<form:form modelAttribute="Visitor" action="submitVisitor" method="post" enctype="multipart/form-data">
		  	<fieldset>		
				<legend>product Fields</legend>
				
				
				<p>
	
					<form:label for="VisitorName" path="VisitorName" cssErrorClass="error">VisitorName:</form:label><br/>
					<form:input path="VisitorName" /> <form:errors path="VisitorName" />
				</p>
				<p>	
					<form:label for="password" path="password" cssErrorClass="error">password:</form:label><br/>
					<form:input path="password" /> <form:errors path="password" />
				</p>
				<p>	
					<form:label for="VisitorEmail" path="VisitorEmail" cssErrorClass="error">VisitorEmail:</form:label><br/>
					<form:input path="VisitorEmail" /> <form:errors path="VisitorEmail" />
				</p>
					<p>
					<form:label	for="VisitorPhone" path="VisitorPhone" cssErrorClass="error">VisitorPhone:</form:label><br/>
					<form:input path="VisitorPhone" /> <form:errors path="VisitorPhone" />			
				</p>		
				
					<input type="submit" />
				</p>
			</fieldset>
		</form:form>
		
		</div>
		<div>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more »</a></p>
        
      </div>
    </div>

   
        

      <hr>

      <footer>
        <p>© Company 2014</p>
      </footer>
    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  >
  

</body></html>