<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>Charity Donation</title>

    <link rel="stylesheet" href="<c:url value="resources/css/style.css"/>"/>
</head>
<body>
<jsp:include page="loginheader.jsp"/>

<section class="login-page">
    <h2>Załóż konto</h2>
    <form:form method="post" modelAttribute="user">
        <div class="form-group">
            <form:input path="firstName" placeholder="Imię" />
            <form:errors path="firstName"/>
        </div>
        <div class="form-group">
            <form:input path="lastName" placeholder="Nazwisko" />
            <form:errors path="lastName"/>
        </div>
        <div class="form-group">
            <form:input path="username" placeholder="Nazwa użytkownika" />
            <form:errors path="username"/>
        </div>
        <div class="form-group">
            <form:input path="email" placeholder="Email" />
            <form:errors path="email"/>
        </div>
        <div class="form-group">
            <form:password path="password" placeholder="Hasło" />
            <form:errors path="password"/>
        </div>
<%--        <div class="form-group">--%>
<%--            <input type="password" name="password2" placeholder="Powtórz hasło" />--%>
<%--        </div>--%>

        <div class="form-group form-group--buttons">
            <a href="<c:url value="/login"/>" class="btn btn--without-border">Zaloguj się</a>
            <form:button class="btn" type="submit">Załóż konto</form:button>
        </div>
    </form:form>
</section>

<jsp:include page="footer.jsp"/>
</body>
</html>
