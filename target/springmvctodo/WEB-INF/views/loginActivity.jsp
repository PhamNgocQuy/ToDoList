
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: QuyPN
  Date: 6/21/2017
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>


    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap-theme.min.css"/>">


    <title>Login</title>

    <style>
        p.serif {
            font-family: "Times New Roman", Times, serif;
        }

        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #eee;
        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }

        .form-signin .checkbox {
            font-weight: normal;
        }

        .form-signin .form-control {
            position: relative;
            height: auto;
            -webkit-box-sizing: border-box;
            -moz-box-sizing: border-box;
            box-sizing: border-box;
            padding: 10px;
            font-size: 16px;
        }

        .form-signin .form-control:focus {
            z-index: 2;
        }

        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }

    </style>
</head>
<body>


<p class="serif" style="font-size: 80px; text-align: center; color: #2aabd2">To do</p>

</div>
<div class="container">


    <form:form cssClass="form-signin" method="post" action="/list-todos">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputUser" class="sr-only">User Name</label>

        <input type="text" id="inputUser" class="form-control" placeholder="User name" required autofocus
               value="" name="user">

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Password"
               value="" name="pass">

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form:form>
</div> <!-- /container -->


<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js"/> "></script>
</body>
</html>
