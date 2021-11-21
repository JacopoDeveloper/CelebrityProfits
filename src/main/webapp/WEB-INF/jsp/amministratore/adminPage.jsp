<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 19/11/2021
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CelebrityProfits - Pagina Admin</title>
    <link rel="stylesheet" type="text/css" href="css/adminPage.css">
</head>
<body>
<%@include file="../include/header.jsp"%>



<div class="container_card">
    <div class="card">
        <span><a href="InsServlet">Inserisci celebrità</a></span>
    </div>

    <div class="card">
        <span><a href="#">Inserisci Patrimonio</a></span>
    </div>

    <div class="card">
        <span><a href="#">Inserisci nuovo Amministratore</a></span>
    </div>

</div>

<%@include file="../include/footer.jsp"%>
</body>
</html>
