<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 19/11/2021
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CelebrityProfits - Admin - Inserisci Celebrità</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">

    <style>

    </style>
</head>
<body>
<%@include file="../include/header.jsp"%>

<div class="container_form">
    <!--<span class="title">Login</span>-->
    <form action="InserisciCelebritaServlet" method="post" enctype="multipart/form-data">
        <h2 class="title">Inserisci una nuova celebrità</h2>
        <div class="campo_form">
            <!--<ion-icon name="person-outline"></ion-icon>-->
            <input type="text" name="nome" placeholder="Nome" style="color: #CDA434"><br>
        </div>
        <div class="campo_form">
            <!--<ion-icon name="lock-closed-outline"></ion-icon>-->
            <input type="text" name="lavoro" placeholder="Lavoro" style="color: #CDA434"><br>
        </div>
        <div class="campo_form">
            <!--<ion-icon name="lock-closed-outline"></ion-icon>-->
            <label for="upload_photo">Carica Immagine</label>
            <input type="file" id="upload_photo" name="immagine" placeholder="Lavoro" style="color: #CDA434"><br>
        </div>

        <input type="submit" value="Login">
    </form>
</div>


<%@include file="../include/footer.jsp"%>
</body>
</html>
