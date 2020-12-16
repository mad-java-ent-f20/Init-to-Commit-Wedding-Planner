<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Navigation Menu -->
<nav class="navbar fixed-top navbar-expand-lg navbar-toggleable-md bg-white">
    <div class="container">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#mainNavbar" aria-controls="mainNavbar" aria-expanded="false" aria-label="Toggle navigation">
            <span class="fa fa-navicon fa-lg"></span>
        </button>
        <a class="smoothscroll navbar-brand" href="#home"><img src="assets/images/topper.jpg" alt="logo"></a>
        <!--title-->


        <div class="container">
            <div class="row text-center">
                <div class="col col-sm-12">
                    <h1 class="heading"><span>In-it to Commit Wedding Planner</span></h1>
                </div>
            </div>


            <div class="collapse navbar-collapse flex-row-reverse" id="mainNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="smoothscroll nav-link" href="index.jsp">home</a>
                    </li>
                    <li class="nav-item">
                        <a class="smoothscroll nav-link" href="#about">about us</a>
                    </li>
                    <li class="nav-item">
                        <a class="smoothscroll nav-link" href="index.jsp">contact</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="col-6 col-xl-2 text-right" data-aos="fade-down">
            <div class="d-none d-xl-inline-block">


                <c:choose>
                    <c:when test="${(pageContext.request.isUserInRole('admin'))}">
                        <a href="logout.jsp"><button class="btn btn-primary py-2 px-4 text-white">Logout</button></a>
                    </c:when>

                    <c:otherwise>
                        <a href="submitLogin"><button class="btn btn-primary py-2 px-4 text-white">Admin</button></a>
                    </c:otherwise>
                </c:choose>



            </div>
        </div>
    </div>
</nav>