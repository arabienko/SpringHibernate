<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Spring+Hibernate+MVC+AOP</title>
</head>
<body class="container-fluid p-10 ">
<h1>
Info worker ...
</h1>
<br>
<br>
<form:form action = "saveWorker" modelAttribute = "worker">
<form:hidden path = "id"/>
Name <form:input path="name"/>
<br><br>
Surname <form:input path="Surname"/>
<br><br>
Salary <form:input path="Salary"/>
<br><br>
Department <form:input path="Department"/>
<br><br>
<input type = "submit" value="Save worker"/>
</form:form>
<br>
</body>
</html>