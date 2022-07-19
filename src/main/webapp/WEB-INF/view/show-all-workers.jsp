<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Spring+Hibernate+MVC+AOP</title>
</head>
<body class="container-fluid p-10 ">
<h1>
All workers!!!
</h1>
<br>
<br>
<table  class="table table-striped table-hover" border="1" cellpadding="5" cellspacing="5">
<tr>
<th>NAME</th>
<th>SURNAME</th>
<th>Department</th>
<th>Salary</th>
<th>Operations</th>
</tr
<c:forEach var= "worker" items = "${allWorkers}">
<c:url var = "updateButton" value = "/updateInfo">
<c:param name = "workerID" value = "${worker.id}"/>
</c:url>
<tr>
<td>${worker.name}</td>
<td>${worker.surname}</td>
<td>${worker.department}</td>
<td>${worker.salary}</td>
<td>
<input type = "button" value = "Update" onclick =" window.location.href = '${updateButton}'"
</td>
</tr>

</c:forEach>
<tr>
</tr>
</table>
<br>
<input type = "button" value = "Add new worker" onclick =" window.location.href = 'addWorker'"

</body>
</html>