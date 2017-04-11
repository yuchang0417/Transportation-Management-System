<%@page session="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html lang="en"><head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>Welcome to The TMA Manage System</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
          <form action="j_spring_security_check" method="POST">
    <table>
        <tbody>
        <tr>
            <td>User:</td>
            <td><input type="text" name="j_username" value=""></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="j_password"></td>
        </tr>
        <tr>
            <td colspan="2"><input name="submit" type="submit" value="Login"></td>
        </tr>
        </tbody>
    </table>
</form>
        </div><!--/.navbar-collapse -->
      </div>
    </nav>



 <!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
        <h1>Hello, Visitors</h1>
        <p>Welcome to our Transportation Management System, please Login in and conform your information before you use our website. </p>

<form action="${request.contextPath}/j_spring_security_check" method="POST">
    <table>
        <tbody>
        <tr>
            <td>User:</td>
            <td><input type="text" name="j_username" value=""></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="password" name="j_password"></td>
        </tr>
        <tr>
            <td colspan="2"><input name="submit" type="submit" value="Login"></td>
        </tr>
        </tbody>
    </table>
</form>



      </div>
    </div>

</body>
</html>