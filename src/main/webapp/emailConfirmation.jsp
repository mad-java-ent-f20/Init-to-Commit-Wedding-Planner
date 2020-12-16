<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp" />
<body>

<!-- Navigation Menu -->
<jsp:include page="allNav.jsp" />

<!--right side -->
<div class="wrapper">
    <div class="image">
        <div class="row justify-content-center text-center">
            <div class="col-12 col-sm-10 wow slideInDown">
                <img src="assets/images/email.jpg" class="img-fluid" alt="email image">
            </div>
        </div>
    </div>

    <!--left side -->
    <div class="form">
        <div id="about"></div>
        <section class="about-us">
            <div class="container">
                <div class="row text-center">
                    <div class="col col-sm-12">
                        <h1 class="heading"><span>Email Confirmation</span></h1>
                        <p class="sub-heading">
                            We have received your email and will get back to you shortly!
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