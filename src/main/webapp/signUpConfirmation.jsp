<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/11/20
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<jsp:include page="head.jsp" />
<body role="document">
<jsp:include page="indexNav.jsp" />

<div class="container theme-showcase" role="main">

    <c:choose>
        <c:when test = "${errorMessage == null}">
            <div class="alert alert-success" role="alert">
                <strong>New User Registration -- Success</strong>
            </div>
        </c:when>
        <c:otherwise>
            <div class="alert alert-danger" role="alert">
                <strong>New User Registration -- Failed</strong>$<br />
                {errorMessage}<br /><br />
                <a href="signUp.jsp"><button type="button" class="btn btn-primary">
                    Retry</button></a>
                <a href="displayProfile"><button type="button" class="btn btn-default">Cancel

            </div>
        </c:otherwise>
    </c:choose>



</div>
</body>
<jsp:include page="footer.jsp" />
</html>
