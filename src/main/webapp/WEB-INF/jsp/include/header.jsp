<%--
  Created by IntelliJ IDEA.
  User: jacop
  Date: 17/11/2021
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="css/header.css">
</head>
<body>
    <div class="header">
        <div class="logo">
            <img src="images/logo.jpg">
        </div>

        <div class="ricerca">
            <div class="barra_di_ricerca">
                <input type="text" class="ricerca" placeholder="Cerca" name="ricerca">
                <ion-icon name="search-outline"></ion-icon>
            </div>

            <div class="valuta">
                <select name="valuta">
                    <option value="" disabled selected hidden>Valute</option>
                    <option value="€" class="valueSelect">€</option>
                    <option value="$" class="valueSelect">$</option>
                </select>
                <!--<ul>
                    <li>
                        <a href="#">Menu</a>
                        <ul></ul>
                        <ul></ul>
                        <ul></ul>
                        <ul></ul>
                    </li>
                </ul>-->
            </div>

        </div>



        <div class="sezioni">
            <span><a href="#">Uomo</a></span>
            <span><a href="#">Donna</a></span>
        </div>
    </div>


    <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
    <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>
