<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Planification</title>
<style>
      body 
       {
          background: url("wall2.jpg");
       }
</style>
</head>
<body>
 <img align="top" src="ensmr110.png"> <br/>
 <form action="add.sout" method="post">
  <table border = "1" align="center">  
   <tr><td>Etudiant1</td><td><input type="text" name="etudiant1"></td></tr>
   <tr><td>Etudiant2</td> <td><input type="text" name="etudiant2"></td></tr>
   <tr><td>Departement</td><td><input type="text" name="departement"></td></tr>
   <tr> <td>Sujet</td><td><input type="text" name="sujet"></td></tr>
   <tr><td>Date(respecter le format yyyy-MM-dd)</td><td><input type="text" name="date"></td></tr>
   <tr> <td>Encadrant1</td><td><input type="text" name="encadrant1"></td></tr>
   <tr><td>Encadrant2</td> <td><input type="text" name="encadrant2"></td></tr>
   <tr> <td>Organisme</td> <td><input type="text" name="organisme"></td></tr>
   <tr><td>Parrain1</td> <td><input type="text" name="parrain1"></td></tr>
   <tr><td>Parrain2</td> <td><input type="text" name="parrain2"></td></tr>
   <tr><td>Lieu</td><td><input type="text" name="lieu"></td></tr>
   <tr><td>Président</td> <td><input type="text" name="president"></td></tr>
   <tr><td>Membre de jury</td> <td><input type="text" name="jury1"></td></tr>
   <tr> <td>Membre de jury</td><td><input type="text" name="jury2"></td></tr>
   <tr> <td>Membre de jury</td><td><input type="text" name="jury3"></td></tr>
   <tr><td colspan="2"><input type= "submit" value="Enregistrer"></td></tr>
  </table>
 </form>
    <a href = "Default.jsp">Retourner à l'accueil</a>
</body>
</html>