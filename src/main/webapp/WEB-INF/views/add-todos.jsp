<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 12/06/22
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>New Todo</title>
    <link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body class="container">
<form:form method="post" modelAttribute="todo">
    <fieldset class="from-group mb-3">
        <form:hidden path="id"/>
        <form:label class="form-label" for="desc" path="desc">Course Name</form:label>
        <form:input class="form-control" id="desc" type="text" name="desc" path="desc" required="required"/>
        <form:errors cssClass="text-warning" path="desc"/>
    </fieldset>
    <!--Needed to make the date input type text so that bootstrap date picker can work on it and format the date -->
    <fieldset class="form-group mb-3">
        <form:label path="targetDate">Date</form:label>
        <form:input path="targetDate" type="text" class="form-control" required="required"/>
        <form:errors path="targetDate" cssClass="text-warning"/>
    </fieldset>
    <div>
        <button class="btn btn-success" type="submit">Submit</button>
    </div>
</form:form>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
<script>
    $('#targetDate').datepicker({
        format: 'dd/mm/yyyy'
    });
</script>
</body>
</html>
