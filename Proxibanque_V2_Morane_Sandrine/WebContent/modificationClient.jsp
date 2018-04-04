<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd%22%3E
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="stylelogin.css" />
<title>Modification client</title>
</head>
<body>
<form method="post" action="ServletModifierClient">
        <fieldset>
            <legend><h1>Informations modifiables du client ${clientChoisi.idclient}</h1></legend>
            </br>
            <label>Nom</label>
             <input type="text" id="nom" name="nom" value="${clientChoisi.nom}"/>
            </br>
            <label>Prénom</label>
            <input type="text" id="prenom" name="prenom" value ="${clientChoisi.prenom}" />
            </br>
            <label>Email</label>
            <input type="text" id="email" name="email" value ="${clientChoisi.email}" />
            </br>
            <label>Adresse</label>
            <input type="text" id="adresse" name="adresse" value ="${clientChoisi.adresse}" />
            </br>
            <label>Code Postal</label>
            <input type="text" id="codepostal" name="codepostal" value ="${clientChoisi.codePostal}" />
            </br>
            <label>Ville</label>
            <input type="text" id="ville" name="ville" value ="${clientChoisi.ville}" />
            </br>
            </br>
            <li><input type="submit" id="Valider" value="Valider" />
            <input type="reset" id="Annuler" value="Annuler" /></li>
        </fieldset>
</form>
</body>
</html>