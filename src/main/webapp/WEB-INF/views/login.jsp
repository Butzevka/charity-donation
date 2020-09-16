<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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
    <h2>Zaloguj się</h2>
    <form:form method="post">
        <div class="form-group">
            <form:input path="username" type="username" class="form-control form-control-user" id="inputEmail" aria-describedby="emailHelp" placeholder="Użytkownik"/></div>
        </div>
        <div class="form-group">
            <form:input path="password" type="password" class="form-control form-control-user" id="inputPassword" placeholder="Hasło"/></div>
            <a href="<c:url value="/forgot"/>" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>
        </div>

        <div class="form-group form-group--buttons">
            <a href="<c:url value="/register"/>" class="btn btn--without-border">Załóż konto</a>
            <form:button class="btn" type="submit">Zaloguj się</form:button>
        </div>
    </form:form>
</section>

<jsp:include page="footer.jsp"/>
</body>
</html>
