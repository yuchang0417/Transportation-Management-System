<html lang="en"><head>
    <meta charset="utf-8">
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
          <a class="navbar-brand" href="#">The Trasportation ManagementSystem</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" action="loginsubmit" method="post">
            <div class="form-group">
              <input name ="LoginID" type="text" placeholder="LoginID" class="form-control">
            </div>
            
            
            <div class="form-group">
              <input name="password" type="password" placeholder="Password" class="form-control">
            </div>
            
             <select name="userType">
	        <option>--userType--</option>
	         <option value="manager">Manager</option>
	         <option value="Visitor">Visitor</option>
	         </select>
            <button type="submit" class="btn btn-success">Sign in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>

    <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Hello, Visitors</h1>
        <p>Welcome to our Transportation Management System, please Login in and conform your information before you use our website. </p>
        <p><a class="btn btn-primary btn-lg" href="#" role="button">Learn more »</a></p>
      </div>
    </div>

    <div class="container">
   
      <div class="row">
        <div class="col-md-4">
          <h2>Register as an Administer</h2>
          <p>For website managers, you need to offer your managerID in our company and register it in our website to get your authentication  </p>
          <p><a class="btn btn-default" href="manager" role="button">View details »</a></p>
        </div>
        <div class="col-md-4">
          <h2>Register as an normal User</h2>
          <p>Welcome to use our website, you can get your tracking information after you registered your informatin in our company </p>
          <p><a class="btn btn-default" href="Visitor" role="button">View details »</a></p>
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
  
  

</body></html>