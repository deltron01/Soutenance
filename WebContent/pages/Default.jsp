<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Soutenances ENSMR</title>
<style>
      body 
       {
          background: url("wall2.jpg");
       }
</style>
</head>
<body>
   <img align="top" src="ensmr110.png"><br/>
   <h1 align = "center">-- Bienvenue à l'ENSMR ! --</h1>
   <h3>  Vous êtes sur le portail des soutenances 2015 // Réalisé par MAATALLA</h3>
   <h3>Vous pouvez faire la recherche selon l'un des critères ci-dessous :</h3> <br/>
   <form action="search.sout" method="post">
   Etudiant : <input type="text" name="val"><input type="hidden" name ="id" value = "etudiant"> <input type="submit" name = "etudiant" value="Rechercher">
   </form>
   <form action="search.sout" method="post">
   Encadrant : <input type="text" name="val"> <input type="hidden" name ="id" value = "encadrant"><input type="submit" name = "encadrant" value="Rechercher">
   </form>
   <form action="search.sout" method="post">
   Membre de jury : <input type="text" name="val"><input type="hidden" name ="id" value = "jury"> <input type="submit" name = "jury" value="Rechercher">
   </form>
   <form action="search.sout" method="post">  
   Organisme : <input type="text" name="val"> <input type="hidden" name ="id" value = "organisme"><input type="submit" name = "organisme" value="Rechercher">
   </form>
   <form action="pardate.sout" method="post">  
   Par date (respecter le format aaaa-mm-jj) : Entre<input type="text" name="date1">Et<input type="text" name ="date2"><input type="submit" name = "pardates" value="Rechercher">
   </form>
   <form action="getall.sout" method="post">
   <input type="submit" value = "Afficher toutes les soutenances programmées">
   </form> <br/>
   <h3>  Résultats</h3>
   <a href ="ajouter.jsp">Planifier une nouvelle soutenance</a>
   <jstl:choose>
   <jstl:when test="${listeSout.size() != 0 }">
   <table border = "1" align="center">  
   <tr>
    <th>Etudiant1</th>
    <th>Etudiant2</th>
    <th>Departement</th>
    <th>Sujet</th>
    <th>Organisme</th>
    <th>Date</th>
   </tr>
   <jstl:forEach items= "${listeSout}" var="s">  
   <tr>
    <td>${s.etudiant1 }</td>
    <td>${s.etudiant2 }</td>
    <td>${s.departement }</td>
    <td>${s.sujet }</td>
    <td>${s.organisme }</td>
    <td>${s.datesoutenance }</td>
    <td><a href = "details.sout?id=${s.idS }">Voir détails</a></td>
    <td><a href = "delete.sout?id=${s.idS }">Annuler cette soutenance</a></td>
   </tr>  
  </jstl:forEach>
  </table>
  </jstl:when>
  <jstl:otherwise>
  <table align ="center">
     <tr><td><h4>Aucune soutenance programmée correspondante à votre recherche !</h4></td></tr>
  </table>
  </jstl:otherwise>
  </jstl:choose>
  <br/>
</body>
</html>