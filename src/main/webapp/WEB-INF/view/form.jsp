<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>Pridani inzeratu</h1>
<form:form method="POST" modelAttribute="inzerat">
	Text:<br>
	<form:input path="text"/><br>
	Cena:<br>
	<form:input path="cena"/><br>
	<br>
	<input type="submit" value="Odeslat">
</form:form>
</body>
</html>