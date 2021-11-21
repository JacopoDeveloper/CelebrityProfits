<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 19/11/2021
  Time: 14:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CelebrityProfits - Pagina d'errore</title>
</head>
<body>
    <%@include file="WEB-INF/jsp/include/header.jsp"%>
    <%
        String errorMessage = request.getParameter("error-message");
    %>

    <h1>Errore : <%=errorMessage%></h1>


    <%@include file="WEB-INF/jsp/include/footer.jsp"%>
</body>
</html>
