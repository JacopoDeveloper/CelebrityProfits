<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 21/11/2021
  Time: 13:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CelebrityProfits</title>
    <link rel="stylesheet" type="text/css" href="././css/index.css">

    <style>
        .container_celebrities{

        }

        .celebrity_details{
            background-color: rgba(31, 31, 31, 0.8);
            margin-left: 0;
            margin-right: 0;
            line-height: 0.7;
            padding: 1.4px;
            text-align:center;
            margin-top: 75%
        }
    </style>
</head>
<body>
<%@include file="include/header.jsp"%>

    <div class="container_celebrities">
        <c:forEach items="${listaSesso}" var="celebrity">
            <div class="celebrity" style="background-image: url('${celebrity.immagine}'); background-size: cover; position: relative; top: 15px">

                <h1 class="rank">Posizione n ${celebrity.posizione}</h1>

                <div class="celebrity_details" style="margin-top: 75%;">
                    <p class="nome">${celebrity.nome}</p><br>
                    <p class="lavoro">Lavoro : ${celebrity.descrizione}</p><br>
                    <p class="patrimonio">Patrimonio : 180€</p>
                </div>

            </div>
        </c:forEach>
    </div>

    <!---->
<%@include file="include/footer.jsp"%>
</body>
</html>
