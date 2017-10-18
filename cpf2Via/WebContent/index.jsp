<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>2 Via Boleto Bradesco</title>

</head>
<script language="JavaScript" src="js/validacao.js"></script>
<link rel="stylesheet" type="text/css" href="CSS/bootstrap.min.css" />
<body align="center">


	<div class="row">
		<img src="imagens/irtBanner.jpg" style="width: 100%" />
	</div>
	<div class="container" align="center"></div>
	<label for="cpf">Segunda Via Boleto</label>
	<form name="FormCpf" class="form-inline">
		<br> <br>
		<div class="container center_div">
			<div class="form-group" align="center">
				<label for="cpf">Cpf/Cnpj:</label><input maxlength="14" type="cpf"
					class="form-control" id="cpfcnpj" placeholder="Digite Cpf ou Cnpj"
					name="cpfcnpj"
					onkeypress="FormataCPF(document.FormCpf,'cpf_cnpj',11,8,5,2,event);">
				<input value="Enviar" class="btn btn-primary" type="submit">

			</div>
		</div>
	</form>


</body>
</html>