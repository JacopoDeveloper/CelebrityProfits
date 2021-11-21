<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 19/11/2021
  Time: 12:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>CelebrityProfits - Login</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style>
        body{
            background-color: #000000;
        }
    </style>
</head>
<body>
    <!--Header-->
    <%@include file="../include/header.jsp"%>

    <div class="container_form">
        <!--<span class="title">Login</span>-->
        <form action="LoginServlet" method="post">
            <h2 class="title">Login</h2>
            <div class="user">
                <!--<ion-icon name="person-outline"></ion-icon>-->
                <input type="text" name="user" placeholder="Username" style="color: #CDA434"><br>
            </div>
            <div class="password">
                <!--<ion-icon name="lock-closed-outline"></ion-icon>-->
                <input type="password" name="password" placeholder="Password" style="color: #CDA434"><br>
            </div>

            <input type="submit" value="Login">
        </form>
    </div>


    <%@include file="../include/footer.jsp"%>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
