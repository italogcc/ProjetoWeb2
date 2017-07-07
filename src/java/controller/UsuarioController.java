/*
Servlet para envio dos dados de cadastro
*/
package controller;

import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioModel;

public class UsuarioController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        UsuarioModel usuariomodel = (UsuarioModel) session.getAttribute("usuariomodel");
        
        if (usuariomodel == null) {
            usuariomodel = new UsuarioModel();
            session.setAttribute("usuariomodel", usuariomodel);
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/usuarioCadastro.jsp");
        dispatcher.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        UsuarioModel usuariomodel = (UsuarioModel) session.getAttribute("usuariomodel");
       
        if (usuariomodel == null) {
        }
    
        /*
        Atencão: REVER STRING e INT! Por hora, fazer tudo como STRING.
        
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        int cpf = request.getParameter("cpf");
        int datanasc = request.getParameter("datanasc");
        char sexo = request.getParameter("sexo");
        int telefone01 = request.getParameter("telefone01");
        int telefone02 = request.getParameter("telefone02");
        String logradouro = request.getParameter("logradouro");
        int lognumero = request.getParameter("lognumero");
        String logcomplemento = request.getParameter("logcomplemento");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String planosaude01 = request.getParameter("planosaude01");
        String planosaude02 = request.getParameter("planosaude02");			
        int matricula = request.getParameter("matricula");
        */          
     
        String matricula = request.getParameter("matricula");
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String idpessoal01 = request.getParameter("idpessoal01");
        String idpessoal02 = request.getParameter("idpessoal02");
        String sexo = request.getParameter("sexo");
        String datanasc = request.getParameter("datanasc");
        String filpai = request.getParameter("filpai");
        String filmae = request.getParameter("filmae");
        String telefone01 = request.getParameter("telefone01");
        String telefone02 = request.getParameter("telefone02");
        String logradouro = request.getParameter("logradouro");
        String lognumero = request.getParameter("lognumero");
        String logcomplemento = request.getParameter("logcomplemento");
        String bairro = request.getParameter("bairro");
        String cidade = request.getParameter("cidade");
        String estado = request.getParameter("estado");
        String planosaude01 = request.getParameter("planosaude01");
        String numplanosaude01 = request.getParameter("numplanosaude01");
        String planosaude02 = request.getParameter("planosaude02");			
        String numplanosaude02 = request.getParameter("numplanosaude02");

        usuariomodel.setMatricula(matricula);
        usuariomodel.setNome(nome);
        usuariomodel.setSobrenome(sobrenome);
        usuariomodel.setIdPessoal01(idpessoal01);
        usuariomodel.setIdPessoal02(idpessoal02);
        usuariomodel.setDatanasc(datanasc);
        usuariomodel.setSexo(sexo);
        usuariomodel.setTelefone01(telefone01);
        usuariomodel.setTelefone02(telefone02);
        usuariomodel.setLogradouro(logradouro);
        usuariomodel.setLognumero(lognumero);
        usuariomodel.setLogcomplemento(logcomplemento);
        usuariomodel.setBairro(bairro);
        usuariomodel.setCidade(cidade);
        usuariomodel.setEstado(estado);
        usuariomodel.setPlanosaude01(planosaude01);
        usuariomodel.setNumplanosaude01(numplanosaude01);
        usuariomodel.setPlanosaude02(planosaude02);
        usuariomodel.setNumplanosaude02(numplanosaude02);
                       
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/view/usuarioConfCad.jsp");
        dispatcher.forward(request,response);
    }
    
    @Override
    public String getServletInfo() {
        return "description";
    }

}
