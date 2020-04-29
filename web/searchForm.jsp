<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search</title>
</head>
<body>
	<!-- <form action="tutorials/getTutorial.action" method="post">
<input id="language" type="text" name="language"/>
<input type="submit" value="submit"/>
</form> -->
	<s:form action="tutorials/getTutorial" method="post">
		<s:textfield label="Enter the Language" key="language" />
		<s:submit/>
	</s:form>
</body>
</html>