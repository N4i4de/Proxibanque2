<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="stylelogin.css" />
<title>Afficher client</title>
</head>
<body>
<form method="post" action="ServletAfficherClient2">
		<fieldset>
			<legend><h1>Client ${clientChoisi.idclient}</h1></legend>
			</br>
			<label>Nom</label>
			${clientChoisi.nom}
			</br>
			<label>Prénom</label>
			${clientChoisi.prenom}
			</br>
			<label>Email</label>
			${clientChoisi.email}
			</br>
			<label>Adresse</label>
			${clientChoisi.adresse}
			</br>
			<label>Code Postal</label>
			${clientChoisi.codepostal} 
			</br>
			<label>Ville</label>
			${clientChoisi.ville} 
			</br>
			</br>
		</fieldset>
</form>
</body>
</html>