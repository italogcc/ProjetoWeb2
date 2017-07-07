/*
    Ajustar e implementar o login
*/
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginVerificador;
import model.User;

public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        RequestDispatcher rd = null;
        Authenticator authenticator = new Authenticator();
        String result = authenticator.authenticate(username, password);
        if (result.equals("success")) {
            rd = request.getRequestDispatcher("/logincorreto.jsp");
            User user = new User(username, password);
            request.setAttribute("user", user);
        } else {
            rd = request.getRequestDispatcher("/loginerrado.jsp");
        }
        rd.forward(request, response);
    }
}
