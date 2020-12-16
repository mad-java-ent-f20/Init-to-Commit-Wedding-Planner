<%--
  Created by IntelliJ IDEA.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<%@include file="head.jsp"%>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    session.invalidate();
    response.sendRedirect("http://localhost:8080/indieproject_war/");
%>
<%@include file="footer.jsp"%>
</body>
</html>