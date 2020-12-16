<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp" />

<body data-spy="scroll" data-target=".navbar" data-offset="56">

<jsp:include page="indexNav.jsp" />

    <!-- Slider -->
    <div id="home"></div>
    <div class="main-slider">
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active">
                </li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="slider-image" src="assets/images/slider2.jpg" alt="First slide">
                    <div class="carousel-caption">
                        <div class="underlay"></div>
                        <div class="content">

                            <div class="container">
                                <div class="row text-center">
                                    <div class="col col-sm-12">
                                        <h1 class="heading"><span>Congratulations!</span></h1>
                                    </div>
                                </div>
                            </div>
                            <a href="#about" class="smoothscroll btn btn-light">about us</a>
                        </div>
                    </div>
                </div>

                <div class="carousel-item">
                    <img class="slider-image" src="assets/images/slider3.jpg" alt="Second slide">
                    <div class="carousel-caption ">
                        <div class="underlay"></div>
                        <div class="content">

                            <div class="container">
                                <div class="row text-center">
                                    <div class="col col-sm-12">
                                        <h1 class="heading"><span>Feeling overwhelmed about planning your big day? We're here to help!</span></h1>
                                    </div>
                                </div>
                            </div>
                            <a href="#about" class="smoothscroll btn btn-light">about us</a>
                        </div>
                    </div>
                </div>
                <div class="carousel-item">
                    <img class="slider-image" src="assets/images/slider1.jpg" alt="Third slide">
                    <div class="carousel-caption ">
                        <div class="underlay"></div>
                        <div class="content">

                            <div class="container">
                                <div class="row text-center">
                                    <div class="col col-sm-12">
                                        <h1 class="heading"><span>We a FREE service so sign up and start planning!</span></h1>
                                    </div>
                                </div>
                            </div>
                            <a href="#about" class="smoothscroll btn btn-light">about us</a>
                        </div>
                    </div>
                </div>
            </div>
            <!--
				<a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
				-->
        </div>
    </div>

    <!-- About Us -->
    <div id="about"></div>
    <section class="about-us">
        <div class="container">
            <div class="row text-center">
                <div class="col col-sm-12">
                    <h1 class="heading"><span>about us</span></h1>
                    <p class="sub-heading">Planning a wedding can be really stressful!  There are so
                        many details to keep track of that can become overwhelming.  Let us help you!  We are a FREE
                        wedding planner that will keep track of all your details in one place.  This service will help
                        you stay organize and assist you in planning a successful special day!
                    </p>
                </div>
            </div>
            <div class="row justify-content-center text-center">
                <div class="col-12 col-sm-10 wow slideInDown">
                    <img src="assets/images/newaboutus.jpg" class="img-fluid">
                </div>
            </div>

            <div class="row justify-content-center">
                <div class="col-12">
                    <div class="row">
                        <div class="col-12 col-md-6 groom wow slideInLeft">
                            <!-- form start here -->
                            <div id="contact1"></div>
                            <section class="contact">
                                <div class="container">
                                    <div class="row text-center">
                                        <div class="col col-sm-12">
                                            <h1 class="heading"><span>Sign Up</span></h1>
                                            <p class="sub-heading">Sign up to start planning your special day!</p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col col-sm-12">
                                            <div class="contact-form justify-content-center">
                                                    <div class="row justify-content-center">
                                                        <div class="col-12 col-sm-4 col-lg-3 col-xl-2 wow slideInUp">
                                                            <a href="signupInfo"><button type="submit" class="btn btn-light btn-block">Go!</button></a>
                                                        </div>
                                                    </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>

                            <p class="social-links">
                                <a href=""><i class="fa fa-facebook fa-lg"></i></a>
                                <a href=""><i class="fa fa-twitter fa-lg"></i></a>
                                <a href=""><i class="fa fa-instagram fa-lg"></i></a>
                                <a href=""><i class="fa fa-linkedin fa-lg"></i></a>
                                <a href=""><i class="fa fa-flickr fa-lg"></i></a>
                                <a href=""><i class="fa fa-google-plus fa-lg"></i></a>
                            </p>
                        </div>
                        <div class="col-12 col-md-6 bride wow slideInRight">

                            <!-- form start here -->

                            <div id="contact1"></div>
                            <section class="contact">
                                <div class="container">
                                    <div class="row text-center">
                                        <div class="col col-sm-12">
                                            <h1 class="heading"><span>Log In</span></h1>
                                            <p class="sub-heading">Login to continue planning!</p>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col col-sm-12">
                                            <div class="contact-form justify-content-center">

                                                    <div class="row justify-content-center">
                                                        <div class="col-12 col-sm-4 col-lg-3 col-xl-2 wow slideInUp">
                                                            <a href="submitLogin"><button type="submit" class="btn btn-light btn-block">Go!</button></a>

                                                        </div>
                                                    </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>

                            <p class="social-links">
                                <a href=""><i class="fa fa-facebook fa-lg"></i></a>
                                <a href=""><i class="fa fa-twitter fa-lg"></i></a>
                                <a href=""><i class="fa fa-instagram fa-lg"></i></a>
                                <a href=""><i class="fa fa-linkedin fa-lg"></i></a>
                                <a href=""><i class="fa fa-flickr fa-lg"></i></a>
                                <a href=""><i class="fa fa-google-plus fa-lg"></i></a>
                            </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!-- Counter -->
    <section class="counter">
        <div class="container">
            <div class="row text-center individual">
                <div class="col-3 wow tada">
                    <img src="assets/images/count-number-bg.png" alt="Counter Background">
                    <h1 id="days"></h1>
                    <h5>Days</h5>
                </div>
                <div class="col-3 wow tada">
                    <img src="assets/images/count-number-bg.png" alt="Counter Background">
                    <h1 id="hours"></h1>
                    <h5>Hours</h5>
                </div>
                <div class="col-3 wow tada">
                    <img src="assets/images/count-number-bg.png" alt="Counter Background">
                    <h1 id="minutes"></h1>
                    <h5>Minutes</h5>
                </div>
                <div class="col-3 wow tada">
                    <img src="assets/images/count-number-bg.png" alt="Counter Background">
                    <h1 id="seconds"></h1>
                    <h5>Seconds</h5>
                </div>
            </div>
            <div class="row text-center allInOne">
                <div class="col-12 wow tada">
                    <img src="assets/images/count-number-bg.png" alt="Counter Background">
                    <h1 id="all"></h1>
                    <h5>D : H : M : S</h5>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Us -->
    <div id="contact"></div>
    <section class="contact">
        <div class="container">
            <div class="row text-center">
                <div class="col col-sm-12">
                    <h1 class="heading"><span>Questions?</span></h1>
                    <p class="sub-heading">Feel free to send us any questions/comments/concerns our way!</p>
                </div>
            </div>
            <div class="row">
                <div class="col col-sm-12">
                    <div class="contact-form justify-content-center">
                        <form action = "contactInfo" method="post">
                            <div class="form-row">
                                <div class="form-group col-md-6 wow slideInLeft">
                                    <input type="text" class="form-control" name="firstname" id="firstname" placeholder="First Name">
                                </div>
                                <div class="form-group col-md-6 wow slideInRight">
                                    <input type="text" class="form-control" name="lastname" id="lastname" placeholder="Last Name">
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6 wow slideInLeft">
                                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject">
                                </div>
                                <div class="form-group col-md-6 wow slideInRight">
                                    <input type="email" class="form-control" name="email" id="email" placeholder="Email">
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-12 wow slideInUp">
                                    <textarea rows="6" class="form-control" name="message" id="message" placeholder="Message..."></textarea>
                                </div>
                            </div>
                            <div class="row justify-content-center">
                                <div class="col-12 col-sm-4 col-lg-3 col-xl-2 wow slideInUp">
                                    <button type="submit" class="btn btn-light btn-block">Send Message</button>
                                </div>
                            </div>
                        </form>
                        </div>
                    </div>
                </div>
            </div>
    </section>

    <!-- Google Map -->


    <!-- Footer -->

<jsp:include page="footer.jsp"/>
</body>

</html>