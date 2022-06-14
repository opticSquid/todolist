<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 11/06/22
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Thanks for filling out the form</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
</head>
<body class="container">
<h1>Thanks <span class="badge rounded-pill bg-info text-black">${name}</span> for filling out the form regards</h1>
<h3><a type="button" class="btn btn-warning" style="text-decoration: none" href="/list">Click here to manage your todos</a></h3>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
