
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp" />


<body data-spy="scroll" data-target=".navbar" data-offset="56">


<!-- Navigation Menu -->
<jsp:include page="allNav.jsp" />
<ul class="navbar-nav">
    <li><a href="<%=request.getContextPath()%>/list"
           class="nav-link">Todos</a></li>
</ul>


<div class="row">

    <div class="column">

    <div class="form">
        <div id="about"></div>
        <section class="about-us" style="width:70%">
            <div class="container">
                <div class="row text-center">

                    <!--right side -->
                    <img src="assets/images/checklist.jpg" class="img-fluid" alt="email image" style="width:100%">

                </div>
            </div>
        </section>
        </div>
    </div>



        <div class="column">

        <!--left side -->
        <div class="form">
            <div id="about"></div>
            <section class="about-us" style="width:150%">
                <div class="container">
                    <div class="row text-center">

                            <h1 class="heading"><span>To do's</span></h1>

                    </div>
                </div>
            </section>

            <!---form starts -->
                <div class="card">
                    <div class="card-body">
                        <c:if test="${todo != null}">
                        <form action="update" method="post">
                            </c:if>
                            <c:if test="${todo == null}">
                            <form action="insert" method="post">
                                </c:if>

                                <caption>
                                    <h2>
                                        <c:if test="${todo != null}">
                                            Edit Todo
                                        </c:if>
                                        <c:if test="${todo == null}">
                                            Add New Todo
                                        </c:if>
                                    </h2>
                                </caption>

                                <c:if test="${todo != null}">
                                    <input type="hidden" name="id" value="<c:out value='${todo.id}' />" />
                                </c:if>

                                <fieldset class="form-group">
                                    <label>Todo Title</label> <input type="text"
                                                                     value="<c:out value='${todo.title}' />" class="form-control"
                                                                     name="title" required="required" minlength="5">
                                </fieldset>

                                <fieldset class="form-group">
                                    <label>Todo Description</label> <input type="text"
                                                                           value="<c:out value='${todo.description}' />" class="form-control"
                                                                           name="description" minlength="5">
                                </fieldset>

                                <fieldset class="form-group">
                                    <label>Todo Status</label> <select class="form-control"
                                                                       name="isDone">
                                    <option value="false">In Progress</option>
                                    <option value="true">Complete</option>
                                </select>
                                </fieldset>

                                <fieldset class="form-group">
                                    <label>Todo Target Date</label> <input type="date"
                                                                           value="<c:out value='${todo.targetDate}' />" class="form-control"
                                                                           name="targetDate" required="required">
                                </fieldset>

                                <button type="submit" class="btn btn-success">Save</button>
                            </form>
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
