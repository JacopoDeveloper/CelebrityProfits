<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">

    <style>
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


<%@include file="WEB-INF/jsp/include/header.jsp"%>

<div class="container_celebrities" id="elenco">
    <c:forEach items="${celebrities}" var="celebrity">
        <div class="celebrity" style="background-image: url('${celebrity.immagine}'); background-size: cover; position: relative; top: 15px">

            <h1 class="rank">Posizione n ${celebrity.posizione}</h1>

            <div class="celebrity_details" style="margin-top: 75%;">
                <p class="nome">${celebrity.nome}</p><br>
                <p class="lavoro">Lavoro : ${celebrity.descrizione}</p><br>
                <p class="patrimonio">Patrimonio : 180€</p>
            </div>

        </div>
    </c:forEach>
    <!--style="background-image: url('images/celebrita/Jeff_Bezo.jpg'); background-size: cover"-->
</div>

<%@include file="WEB-INF/jsp/include/footer.jsp"%>
</body>
</html>