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
</head>
<body>
<h1 style="color: red;">${errMsg}</h1>
<form method="post">
    <div>
        <label for="uname">Username</label>
        <input type="text" id="uname" name="uname"/>
    </div>
    <div>
        <label for="upass">Password</label>
        <input type="password" id="upass" name="upass"/>
    </div>
    <button type="submit">Login</button>
</form>
</body>
</html>
