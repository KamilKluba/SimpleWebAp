<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Witaj, podaj dane do bazy:</h1>
<form action="SimpleWebApplication_war_exploded/index" method="post">
    Imię: <input type="text" name="firstName" width="30"/>
    Nazwisko: <input type="text" name="lastName" width="30"/>
    Data: <input type="date" name="birthDate" width="30"/>
    <input type="submit" value="Dodaj"/>
</form>
</body>
</html>
