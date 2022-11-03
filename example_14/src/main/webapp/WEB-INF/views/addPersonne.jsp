<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Personne</title>
</head>
<body>
	<h2>Ajouter une nouvelle personne</h2>
	<form method="POST" action="addPersonne">
		<div>
			Nom : <input type="text" name="nom">
		</div>
		<div>
			Pr´enom : <input type="text" name="prenom">
		</div>
		<button>Ajouter</button>
	</form>
</body>
</html>