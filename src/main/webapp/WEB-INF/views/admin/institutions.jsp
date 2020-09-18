<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>

    <title>Admin zone</title>
</head>

<a href="/admin/institutions/add">Dodaj fundację</a>

    <table>
        <thead>
        <tr>
        <th>Nazwa </th>
        <th>Opis</th>
        <th>Akcje</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="institution" items="${institutions}">
            <tr>
                <td><c:out value="${institution.name}"/></td>
                <td><c:out value="${institution.description}"/></td>
                <td><a href="<c:url value="/admin/institutions/edit/${institution.id}"/>">Edytuj</a> </td>
                <td><a href="<c:url value="/admin/institutions/delete/${institution.id}"/>">Usuń</a> </td>
            </tr>
        </c:forEach>
        </tbody>


    </table>