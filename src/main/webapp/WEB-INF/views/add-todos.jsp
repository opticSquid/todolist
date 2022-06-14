<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 12/06/22
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Todo</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body>
<form method="post" class="container">
    <div class="mb-3">
        <label class="form-label" for="desc">Course Name</label>
        <input class="form-control" id="desc" type="text" name="desc"/>
    </div>
    <div class="mb-3">
        <label class="form-label" for="targetDate">Date</label>
        <input class="form-control" id="targetDate" type="date" name="targetDate"/>
    </div>
    <div class="mb-3 form-check">
        <label class="form-check-label" for="isDone">Done</label>
        <input class="form-check-input" id="isDone" type="checkbox" name="isDone">
    </div>
    <div>
        <button class="btn btn-success" type="submit">Submit</button>
    </div>
</form>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
</body>
</html>
