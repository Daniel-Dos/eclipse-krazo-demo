<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Palestrantes</title>
</head>
<body>

	<form action="addEvento" method="post">
		Palestra: <input type="text" id="tituloPalestra" name="tituloPalestra" />  <br /><br />
		Palestrante: <input type="text" id="palestrante" name="palestrante" />  <br /> <br />
		Descrição da Palestra: <input type="text" id="descricao" name="descricao" />  <br /> <br />
		
		<input type="submit" value="Enviar" id="button-1" />
	</form>

</body>
</html>