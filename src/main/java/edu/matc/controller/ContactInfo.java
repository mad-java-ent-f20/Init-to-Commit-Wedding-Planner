package edu.matc.controller;

import edu.matc.entity.Contact;
import edu.matc.entity.User;
import edu.matc.persistence.GenericDao;
import edu.matc.util.DaoFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * A simple servlet to welcome the user.
 * @author pwaite
 */

@WebServlet
        (urlPatterns = { "/contactInfo" } )



public class ContactInfo extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GenericDao<User> genericDaoUser = DaoFactory.createDao(User.class);
        GenericDao<Contact> genericDao = DaoFactory.createDao(Contact.class);

        if(req.isUserInRole("user")) {
            String username = req.getRemoteUser();
            logger.info("ContactInfo remoteUser: req.getRemoteUser()  " + req.getRemoteUser());

            List<User> users = genericDaoUser.getByPropertyEqual("userName", username);
            int id = users.get(0).getId();
            logger.info("ContactInfo ID:  " + id);

            User retrievedUser = genericDaoUser.getById(id);
            logger.info("ContactInfo retrievedUser:  " + retrievedUser);

            Contact newContact = new Contact(req.getParameter("firstname"),
                    req.getParameter("lastname"),
                    req.getParameter("email"),
                    req.getParameter("subject"),
                    req.getParameter("message"), username, retrievedUser);
            // Add te contact to DB
            retrievedUser.addContact(newContact);

            int newId = genericDao.insert(newContact);

            Contact contacts = genericDao.getById(newId);
            req.setAttribute("allContacts", contacts);
            logger.info("Sending...." + contacts);
        }
        else {
            Contact newContact = new Contact(req.getParameter("firstname"),
                    req.getParameter("lastname"),
                    req.getParameter("email"),
                    req.getParameter("subject"),
                    req.getParameter("message"));
            // Add te contact to DB
            int newId = genericDao.insert(newContact);

            Contact contacts = genericDao.getById(newId);
            req.setAttribute("allContacts", contacts);
            logger.info("Sending..." + contacts);
        }

        // send email to admin
        SendEmail send = new SendEmail();
        send.getInfo(req.getParameter("subject"), req.getParameter("message"));
        logger.info("Email was sent successfully");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/emailConfirmation.jsp");
        dispatcher.forward(req, resp);
    }

}
