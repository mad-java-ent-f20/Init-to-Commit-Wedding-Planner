package edu.matc.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import edu.matc.entity.Role;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.util.DaoFactory;
import edu.matc.util.VerifyRecaptcha;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by paulawaite on 3/3/16.
 */

@WebServlet(name = "SignUpUser", urlPatterns = { "/signupUser" } )


public class SignUpUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User();
        user.setUserName(req.getParameter("user_name"));
        user.setEmail(req.getParameter("email"));
        user.setFirstName(req.getParameter("first_name"));
        user.setLastName(req.getParameter("last_name"));
        user.setPassword(req.getParameter("password"));
        logger.debug("Adding User: " + user);
        Role role = new Role();
        role.setUser(user);
        role.setRoleName("user");
        user.addUserRoles(role);

        String gRecaptchaResponse = req.getParameter("g-recaptcha-response");
        System.out.println(gRecaptchaResponse);
        boolean isVerified = VerifyRecaptcha.verify(gRecaptchaResponse);

        if (isVerified) {
            // TODO check if user is already in the database
            GenericDao dao = DaoFactory.createDao(User.class);
            dao.insert(user);
        } else {
            req.setAttribute("errorMessage", "Failed Captcha - Please try again");
            logger.info("Failed Captcha");
        }
        RequestDispatcher dispatcher = req.getRequestDispatcher("/signUpConfirmation" +
                ".jsp");
        dispatcher.forward(req, resp);
    }
}
