
package edu.matc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author amoua
 */
@WebServlet(
        urlPatterns = {"/logout"}
)
public class Logout extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}