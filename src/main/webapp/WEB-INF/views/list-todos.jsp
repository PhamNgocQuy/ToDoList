<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/bootstrap/css/bootstrap-theme.min.css"/>">
    <title>Title</title>
</head>
<body>
<p style="font-size: 80px; text-align: center; color: #2aabd2">To do</p>
<div class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <td>Number</td>
            <th>Job</th>
            <th>Date</th>
            <th>IsDone</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo" varStatus="theCount">
            <tr>
                <td>${theCount.count}</td>
                <td>${todo.job}</td>
                <td><fmt:formatDate pattern="dd/MM/yyyy" value="${todo.date}"/></td>
                <td>${todo.done}</td>

                <td><a href="/update-todo?id=${todo.id}&idUser=${userid}"
                       class="btn btn-success">Update</a> <a
                        href="/delete-todo?id=${todo.id}&idUser=${userid}" class="btn btn-danger">Delete</a>
                </td>

            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div>
        <a class="btn btn-success" href="/add-todo?idUser=${userid}">Add</a>
    </div>
</div>

<script type="text/javascript" src="<c:url value="/bootstrap/js/jquery-3.2.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/bootstrap/js/bootstrap.min.js"/> "></script>
</body>
</html>
