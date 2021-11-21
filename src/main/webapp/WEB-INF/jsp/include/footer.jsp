    <%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 17/11/2021
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <style>

        .footer{
            margin-top: 300px;
            border-top: 2px solid var(--gold);
            margin-bottom: 0;
            padding-bottom: 10px;
            color: #CDA434;
            background-color: var(--black);
        }

        .footer p:first-child{
            margin-top: 30px;
        }

        .footer p{
            margin-top: 10px;
            text-align: center;
        }

        .footer img{
            margin-top: 10px;
            margin-left: calc(45% + 30px);
        }

        .admin{
            text-align: end;
            padding-right: 30px;
        }

        .admin a{
            text-decoration: none;
            color: #CDA434;
            font-size: 16px;
        }

    </style>
</head>
<body>
    <div class="footer">
        <p>Email : qualcosa@qualcosaltro.com</p>
        <p>Indirizzo : Non lo so manco io figuati se te lo dico</p>
        <p>Copyright : e biri tu se o tnimm</p>
        <p>Versione 0.1 BETA</p>
        <img src="./././images/logo.png">

        <div class="admin">
            <span><a href="${pageContext.request.contextPath}/LogServlet">Sei un amministratore? Accedi qui!</a></span>
        </div>
    </div>
</body>
</html>
