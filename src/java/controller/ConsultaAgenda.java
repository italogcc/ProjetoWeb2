/*
Servlet para exibição das consultas marcadas
*/
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConsultaAgenda extends HttpServlet {
	public void doGet(HttpServletRequest request,
	HttpServletResponse response)
	throws IOException {

// Código do servlet

PrintWriter out = response.getWriter();

//Captura os agendamentos e os exibe

	}
}
