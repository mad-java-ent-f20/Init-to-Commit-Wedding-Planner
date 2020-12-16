<%@ taglib prefix="text-align" uri="http://jakarta.apache.org/taglibs/standard/permittedTaglibs" %>
e<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/21/20
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>

<html lang="en">

<jsp:include page="head.jsp" />

<body data-spy="scroll" data-target=".navbar" data-offset="56">

<jsp:include page="indexNav.jsp" />


<!-- Login form -->
<div id="contact"></div>
<section class="contact">
    <div class="container">
        <div class="row text-center">
            <div class="col col-sm-12">
                <h1 class="heading"><span>Login Form</span></h1>
            </div>
        </div>
        <div class="row">
            <div class="col col-sm-12">
                <div class="contact-form justify-content-center">

                    <FORM ACTION="j_security_check" METHOD="POST">

                        <div class="row form-group">
                            <div class="col-md-6 mb-3 mb-md-0">
                                <label class="text-black" for="j_username">User name</label>
                                <input type="text" id="j_username" name="j_username" class="form-control">
                            </div>
                            <div class="col-md-6">
                                <label class="text-black" for="j_password">Password</label>
                                <input type="PASSWORD" id="j_password" name="j_password" class="form-control">
                            </div>
                        </div>

                        <div class="row form-group">
                            <div class="col-md-12" text-align:center>
                                <input type="submit" name="submit" value="Sign in" class="btn btn-primary py-2 px-4 text-white">
                            </div>
                        </div>

                    </form>

                </div>
            </div>
        </div>
    </div>
</section>

<div>
    <!-- Footer -->

    <jsp:include page="footer.jsp"/>


</div>
    </body>

    </html>
