<%--
  Created by IntelliJ IDEA.
  User: hoffhenrypereiradasilva
  Date: 13/09/17
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pedra Papel e Tesoura</title>
</head>
<body>
<form action="Servlet" method="post">
  <label> Jogador 1</label>
  <select name="opcaoUsuario">
    <option value="1">Pedra</option>
    <option value="2">Papel</option>
    <option value="3">Tesoura</option>
  </select>
  <input type="submit" value="Jogar"/>
</form>
<p><%= request.getAttribute("opcaoUsuarioString") %></p>
<p><%= request.getAttribute("opcaoComputerString") %></p>
<p><%= request.getAttribute("resultadoPartida") %></p>
</body>
</html>
