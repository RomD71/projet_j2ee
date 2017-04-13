<%--
  Created by IntelliJ IDEA.
  User: Maxime
  Date: 09/03/2017
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Creation Inscription</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
<jsp:include page="inc/menu.jsp"/>

<span class="info"><%
    String attribut = (String) request.getAttribute("message");
    out.println(attribut);
%></span>
<p class="info"></p>
<p>Nom : <c:out value="${member.nom}"/></p>
<p>Prénom : <c:out value="${member.prenom}"/></p>
<p>Email : <c:out value="${member.email}"/></p>
<p>Date de naissance : <c:out value="${member.date}"/></p>
<p>Téléphone : <c:out value="${member.telephone}"/></p>
<p>Sexe : <c:out value="${member.sexe}"/></p>
<p>Password : <c:out value="${member.pass1}"/></p>
<p>Pays : <c:out value="${member.pays}"/></p>
</body>
</html>