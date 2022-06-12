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
</head>
<body>
<form method="post">
    <div>
        <label for="desc">Course Name</label>
        <input id="desc" type="text" name="desc"/>
    </div>
    <div>
        <label for="targetDate">Date</label>
        <input id="targetDate" type="date" name="targetDate"/>
    </div>
    <div>
        <label for="isDone">Done</label>
        <input id="isDone" type="checkbox" name="isDone">
    </div>
    <div>
        <button type="submit">Submit</button>
    </div>
</form>
</body>
</html>
