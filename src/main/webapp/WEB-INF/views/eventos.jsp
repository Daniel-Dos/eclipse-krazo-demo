<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eventos</title>
</head>
<body>

   <a href="eventos/form">Add Registres</a>

    <br />

	<table id="table-1">
		<thead>
			<tr>
				<th>Palestrante</th>
				<th>Palestra</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${eventos}" var="evento">
			<tr align="center" bordercolor="#9090">
				
					<td>${evento.palestrante}</td>
					<td>${evento.tituloPalestra}</td>
					<td>${evento.descricao}</td>
				
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>