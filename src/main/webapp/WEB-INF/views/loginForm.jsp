<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 12/06/22
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>
<form method="post" class="container">
    <div style="display: ${errHidden};" class="row alert alert-danger">${errMsg}</div>
    <div class="mb-3">
        <label class="form-label" for="uname">Username</label>
        <input class="form-control" type="text" id="uname" name="uname"/>
    </div>
    <div>
        <label class="form-label" for="upass">Password</label>
        <input class="form-control" type="password" id="upass" name="upass"/>
    </div>
    <button class="btn btn-success" type="submit">Login</button>
</form>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
