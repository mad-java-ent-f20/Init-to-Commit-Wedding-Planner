<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/10/20
  Time: 5:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp" />
<body>

<div class="site-section" data-aos="fade">
    <div class="container-fluid">

        <div class="row justify-content-center">
            <div class="col-md-7">
                <div class="row mb-5">
                    <div class="col-12 ">
                        <h2 class="site-section-heading text-center">Add Wedding Event</h2>
                    </div>
                </div>

                <div class="row">
                    <div class="col-lg-8 mb-5">
                        <form action="addEventAction" method="POST">


                            <div class="row form-group">
                                <div class="col-md-6 mb-3 mb-md-0">
                                    <label class="text-black" for="budget">Event Budget</label>
                                    <input type="text" id="budget" name="budget" class="form-control">
                                </div>
                                <div class="col-md-6">
                                    <label class="text-black" for="location">Event Location</label>
                                    <input type="text" id="location" name="location" class="form-control">
                                </div>
                            </div>

                            <div class="col-md-6">
                                <label class="text-black" for="location">Number of Guests</label>
                                <input type="text" id="numOfGuests" name="numOfGuests" class="form-control">
                            </div>
                    </div>

                            <div class="row form-group">
                                <div class="col-md-12">
                                    <input type="submit" name="submit" value="Add" class="btn btn-primary py-2 px-4 text-white">
                                </div>
                            </div>


                        </form>
                    </div>


                </div>
            </div>
        </div>

    </div>
</div>
</div>

<div>
    <jsp:include page="footer.jsp" />
</div>



</body>
</html>
