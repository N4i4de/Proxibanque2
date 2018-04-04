<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd%22%3E
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="listeclient.css" />
<title>Liste clients d'un conseiller</title>
</head>
<body>
	<h1>Bienvenue sur Proxibanque!</h1>
	<h2>Voici la liste de vos clients :</h2>

	<c:forEach items="${listclient}" var="elem">
		<ul>
			<li><c:out value="${elem.idclient} " /> <c:out
					value="${elem.nom}" /> <c:out value="${elem.prenom}" /></li>

			<li><a href="ServletAfficherClient?idclient=${elem.idclient}">
					Modifier client </a></li>

			<li><a href="ServletSupprimerClient?idclient=${elem.idclient}">
					Supprimer client </a></li>

			<li><a href="/ServletAfficherCompte=${elem.idclient}"> Liste
					des comptes du client </a></li>

			<li><a href="ServletAfficherClient2?idclient=${elem.idclient}"> Fiche client</a></li>
		</ul>

	</c:forEach>
</body>
</html>