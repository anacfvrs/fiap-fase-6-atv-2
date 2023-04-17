<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultado da busca</title>
</head>
<body>
<c:if test="${not empty mensagem}">
    <p>${mensagem}</p>
</c:if>
<c:if test="${empty mensagem}">
    <p>Nenhum resultado encontrado.</p>
</c:if>
</body>
</html>

