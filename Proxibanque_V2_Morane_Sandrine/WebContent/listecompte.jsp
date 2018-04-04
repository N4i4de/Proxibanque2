<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="styleCompte.css" />
<title>Liste des comptes du client</title>
</head>
<body>
	<h1>Liste des comptes du client ${clientChoisit.idclient}</h1>
	<c:forEach items="${compteList}" var="elem">
		<table>
			<tr>
				<td>Numéro de compte</td>
				<td>Type de compte</td>
				<td>Solde de compte</td>
			</tr>
			<tr>
				<td><c:out value="${elem.numerocompte} " /></td>
				<td><c:out value="${elem.typece}" /></td>
				<td><c:out value="${elem.solde}" /></td>
			</tr>
		</table>
	</c:forEach>
</body>
</html>