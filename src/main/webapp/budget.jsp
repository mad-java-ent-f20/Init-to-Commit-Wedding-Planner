<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 12/12/20
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="HTML, CSS, JS, Template">
    <meta name="author" content="Revol Themes">
    <title>In-it To Commit Wedding Planner</title>
    <!-- Favicons -->
    <link rel="icon" href="assets/images/topping.png">
    <link href="assets/css/budget.css" rel="stylesheet">
</head>


<body data-spy="scroll" data-target=".navbar" data-offset="56">


<!-- Navigation Menu -->



<section>

<div class="top">
    <div class="budget">
        <div class="budget__title">
            Available Budget in <span class="budget__title--month">%Month%</span>:
        </div>

        <div class="budget__value">+ 2,345.64</div>

        <div class="budget__income clearfix">
            <div class="budget__income--text">Income</div>
            <div class="right">
                <div class="budget__income--value">+ 4,300.00</div>
                <div class="budget__income--percentage">&nbsp;</div>
            </div>
        </div>

        <div class="budget__expenses clearfix">
            <div class="budget__expenses--text">Expenses</div>
            <div class="right clearfix">
                <div class="budget__expenses--value">- 1,954.36</div>
                <div class="budget__expenses--percentage">45%</div>
            </div>
        </div>
    </div>
</div>

<div class="bottom">
    <div class="add">
        <div class="add__container">
            <select class="add__type">
                <option value="inc" selected>+</option>
                <option value="exp">-</option>
            </select>
            <input type="text" class="add__description" placeholder="Add description">
            <input type="number" class="add__value" placeholder="Value">
            <button class="add__btn"><i class="ion-ios-checkmark-outline"></i></button>
        </div>
    </div>

    <div class="container clearfix">
        <div class="income">
            <h2 class="income__title">Income</h2>

            <div class="income__list">
            </div>
        </div>


        <div class="expenses">
            <h2 class="expenses__title">Expenses</h2>

            <div class="expenses__list">
            </div>
        </div>
    </div>
</div>

</section>
<footer class="footer">
    <div class="container">
        <div class="row justify-content-center footer-menu">
            <div class="col col-sm-12">
                <ul class="list-inline text-center">
                    <li class="list-inline-item wow fadeIn" data-wow-delay="0.7s">
                        <a class="smoothscroll" href="profile.jsp">Profile</a>
                    </li>
                    <li class="list-inline-item wow fadeIn">
                        <a class="smoothscroll" href="index.jsp">contact</a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="row justify-content-center">
            <div class="col col-sm-12">
                <div class="social">
                    <ul class="list-inline text-center">
                        <li class="list-inline-item wow fadeIn"><i class="fa fa-facebook fa-lg icon" aria-hidden="true"></i></li>
                        <li class="list-inline-item wow fadeIn" data-wow-delay="0.1s"><i class="fa fa-twitter fa-lg icon" aria-hidden="true"></i></li>
                        <li class="list-inline-item wow fadeIn" data-wow-delay="0.2s"><i class="fa fa-linkedin fa-lg icon" aria-hidden="true"></i></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="copyright-section">
            <p class="text-center">&copy; 2016 all rights reserved</p>
        </div>
    </div>
</footer>
<!-- Scripts -->

<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/wow/1.1.2/wow.min.js"></script>
<script src="assets/js/jquery.mixitup.min.js"></script>
<script src="assets/js/BudgetController.js"></script>
</body>
</html>

