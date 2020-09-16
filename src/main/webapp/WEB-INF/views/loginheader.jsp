<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header>
    <nav class="container container--70">
        <ul class="nav--actions">
            <sec:authorize access="isAuthenticated()">
                <span>Witaj <sec:authentication property="principal.user.id"/></span>
                <li><a href="<c:url value="/logout"/>" class="btn btn--small btn--without-border">Wyloguj się</a></li>
            </sec:authorize>
            <sec:authorize access="!isAuthenticated()">
                <li><a href="<c:url value="/login"/>" class="btn btn--small btn--without-border">Zaloguj</a></li>
                <li><a href="<c:url value="/register"/>" class="btn btn--small btn--highlighted">Załóż konto</a></li>
            </sec:authorize>
        </ul>

        <ul>
            <li><a href="<c:url value="/donate"/>" class="btn btn--without-border active">Start</a></li>
            <li><a href="#" class="btn btn--without-border">O co chodzi?</a></li>
            <li><a href="#" class="btn btn--without-border">O nas</a></li>
            <li><a href="#" class="btn btn--without-border">Fundacje i organizacje</a></li>
            <li><a href="#" class="btn btn--without-border">Kontakt</a></li>
        </ul>
    </nav>
</header>