<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 10/21/20
  Time: 6:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp" />

<body data-spy="scroll" data-target=".navbar" data-offset="56">


<!-- Navigation Menu -->
<jsp:include page="allNav.jsp" />

<!-- Profile -->
<div id="about"></div>
<section class="about-us">
    <div class="container">
        <div class="row text-center">
            <div class="col col-sm-12">
                <h1 class="heading"><span>Profile</span></h1>
                <p class="sub-heading">......
                </p>
            </div>
        </div>
    </div>
    <div class="row">
        <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

        <div class="container">
            <h3 class="text-center">Event Info</h3>
            <hr>
        <!--    <div class="container text-left">

                <a href="<%=request.getContextPath()%>/new"
                   class="btn btn-success">Add Todo</a>
            </div> -->
            <br>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Title</th>
                    <th>Target Date</th>
                    <th>Todo Status</th>
                    <th>Actions</th>
                </tr>
                </thead>
                <tbody>
                <!--   for (Todo todo: todos) {  -->
                <c:forEach var="todo" items="${listTodo}">

                    <tr>
                        <td><c:out value="${todo.title}" /></td>
                        <td><c:out value="${todo.targetDate}" /></td>
                        <td><c:out value="${todo.status}" /></td>

                        <td><a href="edit?id=<c:out value='${todo.id}' />">Edit</a>
                            &nbsp;&nbsp;&nbsp;&nbsp; <a
                                    href="delete?id=<c:out value='${todo.id}' />">Delete</a></td>

                        <!--  <td><button (click)="updateTodo(todo.id)" class="btn btn-success">Update</button>
                                  <button (click)="deleteTodo(todo.id)" class="btn btn-warning">Delete</button></td> -->
                    </tr>
                </c:forEach>
                <!-- } -->
                </tbody>

            </table>
        </div>
    </div>







</section>



    <div>
     <!--footer-->
    <jsp:include page="footer.jsp" />
    </div>
</body>

</html>