<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>
<h2>Hello World!</h2>

<h2>服务器：8081</h2>

<br>
<h2>${msg}</h2>

<form name="input" action="list" method="post">
    Username: <input type="text" name="username">
    Password: <input type="text" name="password">
    <input type="submit" value="submit">
</form>
</body>
</html>
