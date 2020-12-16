<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/21/20
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp" />
<body>

<!-- Navigation Menu -->
<jsp:include page="indexNav.jsp" />

<!--right side -->
<div class="wrapper">
    <div class="image">
        <div class="row justify-content-center text-center">
            <div class="col-12 col-sm-10 wow slideInDown">
                <h1>Oops!</h1>
            </div>
        </div>
    </div>

    <!--left side -->
    <div class="form" style="padding-left: 10px; padding-bottom: 20px;">
        <div id="about"></div>
        <section class="about-us">
            <div class="container">
                <div class="row text-center">
                    <div class="col col-sm-12">
                        <h1 class="heading"><span>Login Error</span></h1>
                        <p class="sub-heading">
                            Login info did not match our records.  Please try again.
                        </p>
                        <p>
                        <a href="submitLogin"><button type="submit" class="btn btn-light btn-block">Back to Login</button></a>
                        </p>

                    </div>
                </div>
            </div>
        </section>
    </div>


    <!--footer-->
    <jsp:include page="footer.jsp" />

</body>

</html>