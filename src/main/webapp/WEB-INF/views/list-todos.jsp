<%--
  Created by IntelliJ IDEA.
  User: soumalya
  Date: 12/06/22
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Todos List</title>
</head>
<body>
<button><a href="/addTodos">Click here to add new Todo in the List</a> </button>
<h1>Here are the list of your todos</h1>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>desc</th>
        <th>targetDate</th>
        <th>isDone</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${todos}" var="todo">
        <tr>
            <td>${todo.id}</td>
            <td>${todo.desc}</td>
            <td>${todo.targetDate}</td>
            <td>${todo.done}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
