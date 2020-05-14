<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<body>

<h2>服务器：8081</h2>
<br>
<h2>List All</h2>

<table>
    <tr>
        <td>id</td>
        <td>address</td>
        <td>name</td>
        <td>phone</td>
    </tr>

    <c:forEach items="${listAll}" var="res">
        <tr>
            <td>${res.id}</td>
            <td>${res.address}</td>
            <td>${res.name}</td>
            <td>${res.phone}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
