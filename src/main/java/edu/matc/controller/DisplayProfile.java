
package edu.matc.controller;

import edu.matc.entity.Event;
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
import java.util.ArrayList;
import java.util.List;

/**
 * A simple servlet that displays user profile
 * @author pwaite
 */

 @WebServlet
 (urlPatterns = { "/displayProfile" } )

 public class DisplayProfile<events> extends HttpServlet {

 private final Logger logger = LogManager.getLogger(this.getClass());

 @Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

  GenericDao<User> dao = DaoFactory.createDao(User.class);

  // get user
  logger.debug("Sending back the req.getRemoteUser() is..." + req.getRemoteUser());
  List<User> users = dao.getByPropertyEqual("userName", req.getRemoteUser());

  int user_id = users.get(0).getId();
  logger.debug("user_id is ..." + user_id);

  User user = dao.getById(user_id);

  req.setAttribute("users", user);
  logger.debug("Sending back user..." + user);

  // get event
  GenericDao<Event> dao2 = DaoFactory.createDao(Event.class);
  List<Event> event = dao2.getByPropertyEqual("user_name", req.getRemoteUser());

  int event_id = event.get(0).getId();
  logger.debug("event_id is...." + event_id);

  Event events = dao2.getById(event_id);

  req.setAttribute("events", events);

  RequestDispatcher dispatcher = req.getRequestDispatcher("/profile.jsp");
  dispatcher.forward(req, resp);
 }
}