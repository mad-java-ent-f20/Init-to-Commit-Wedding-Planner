<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/13/20
  Time: 9:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp" />
<body>

<!-- Navigation Menu -->
<jsp:include page="allNav.jsp" />


<div class="text-black h2 mb-0 text-center">
    <c:choose>
        <c:when test="${(pageContext.request.isUserInRole('admin'))}">
            <p>Welcome, ${pageContext.request.remoteUser}</p>
            <a href = "admin.jsp">Admin Homepage</a>
        </c:when>
        <c:when test="${(pageContext.request.isUserInRole('user'))}">
            <p>Welcome, ${pageContext.request.remoteUser}</p>
            <a href = "profile.jsp" >Profile</a>
        </c:when>
    </c:choose>
</div>


<!--footer-->
<jsp:include page="footer.jsp" />

</body>

</html>