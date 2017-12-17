<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Détails</title>
<style>
      body 
       {
          background: url("wall2.jpg");
       }
</style>
</head>
<body>
  <img align="top" src="ensmr110.png">
  <br/> Voici les informations concernant cette soutenance : <br/>
  <table border = "1" align="center">  
   <tr><td>Etudiant1</td><td>${s.etudiant1 }</td></tr>
   <tr><td>Etudiant2</td> <td>${s.etudiant2 }</td></tr>
   <tr><td>Departement</td> <td>${s.departement }</td></tr>
   <tr> <td>Sujet</td><td>${s.sujet }</td></tr>
   <tr><td>Date</td><td>${s.datesoutenance }</td></tr>
   <tr> <td>Encadrant1</td><td>${s.encadrant1 }</td></tr>
   <tr><td>Encadrant2</td> <td>${s.encadrant2 }</td></tr>
   <tr> <td>Organisme</td> <td>${s.organisme }</td></tr>
   <tr><td>Parrain1</td> <td>${s.parrain1 }</td></tr>
   <tr><td>Parrain2</td> <td>${s.parrain2 }</td></tr>
   <tr><td>Lieu</td><td>${s.lieu }</td></tr>
   <tr><td>Président</td> <td>${s.president }</td></tr>
   <tr><td>Membre de jury</td> <td>${s.jury1 }</td></tr>
   <tr> <td>Membre de jury</td><td>${s.jury2 }</td></tr>
   <tr> <td>Membre de jury</td><td>${s.jury3 }</td></tr>
   <tr> <td>Note1</td><td>${s.note1 }</td></tr>
   <tr> <td>Note2</td><td>${s.note2 }</td></tr>
   <tr><td>Note3</td> <td>${s.note3 }</td></tr>
   <tr><td>Note4</td><td>${s.note4 }</td></tr>
   <tr><td>Note5</td> <td>${s.note5 }</td></tr>  
    <tr><td colspan = "2"><a href = "delete.sout?id=${s.idS }">Annuler cette soutenance</a></td></tr>
  </table>
    <a href = "Default.jsp">Retourner à l'accueil</a>
</body>
</html>