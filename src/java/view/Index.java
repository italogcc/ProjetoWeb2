/*
Servlet para início da sessão e AJUSTAR
*/
package view;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioModel;


public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        Index index = (Index) session.getAttribute("index");
        
        if (index == null) {
            index = new Index();
            session.setAttribute("index", index);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/index.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        UsuarioModel usuariomodel = (UsuarioModel) session.getAttribute("usuariomodel");
       
        if (usuariomodel == null) {
        }
    }
    
    @Override
    public String getServletInfo() {
        return "description";
    }

}

