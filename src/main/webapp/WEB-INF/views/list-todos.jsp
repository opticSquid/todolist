<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="commons/header.jspf"%>
<%@ include file="commons/navigation.jspf"%>
<div class="container">
    <div class="row">
        <button class="btn btn-success"><a href="/addTodos" style="text-decoration: none; color: white">Click here to
            add
            new Todo in the List</a></button>
    </div>

    <strong class="row-cols-auto">Here are the list of your todos</strong>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">desc</th>
            <th scope="col">targetDate</th>
            <th scope="col">isDone</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <th scope="row">${todo.id}</th>
                <td>${todo.desc}</td>
                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.targetDate}"/></td>
                <td>${todo.done}</td>
                <td>
                    <a type="button" href="/update-todo?id=${todo.id}" class="btn btn-warning">Update</a>
                </td>
                <td>
                    <a type="button" href="/delete-todo?id=${todo.id}" class="btn btn-danger">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@ include file="commons/footer.jspf"%>
