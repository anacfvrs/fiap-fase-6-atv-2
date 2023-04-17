<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Busca de Hotéis</title>
</head>
<body>
<form action="buscaHoteis" method="get">
    <label for="hotel">Nome do hotel:</label>
    <input type="text" name="hotel" id="hotel" required>
    <button type="submit">Buscar</button>
</form>
</body>
</html>
