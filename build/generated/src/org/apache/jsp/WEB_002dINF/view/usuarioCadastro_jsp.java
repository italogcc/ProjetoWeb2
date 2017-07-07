package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usuarioCadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Sistema de Consultas Integrado - Cadastro de usuários</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h2>Cadastro de usuários</h2>\r\n");
      out.write("\t<h4>Este é o formulário padrão para cadastro de usuários no sistema.</h4>\r\n");
      out.write("\t<h4>Por favor preencher todos os campos.</h4>\r\n");
      out.write("\t\t\r\n");
      out.write("        <form method=\"POST\" action=\"confirm\">\r\n");
      out.write("            Matricula: <input name=\"matricula\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.matricula}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br><br>\r\n");
      out.write("            Nome: <input name=\"nome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.nome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Sobrenome: <input name=\"sobrenome\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.sobrenome}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Identificação 01: <input name=\"idpessoal01\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.idpessoal01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Identificação 02: <input name=\"idpessoal02\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.idpessoal02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Sexo: <input name=\"sexo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.sexo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Data de nascimento: <input name=\"datanasc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.datanasc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Filiação pai: <input name=\"filpai\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.filpai}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Filiação mãe: <input name=\"filmae\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.filmae}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Telefone 01: <input name=\"telefone01\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.telefone01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Telefone 02: <input name=\"telefone02\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.telefone02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Logradouro: <input name=\"logradouro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.logradouro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Número: <input name=\"lognumero\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.lognumero}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Complemento: <input name=\"logcomplemento\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.logcomplemento}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Bairro: <input name=\"bairro\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.bairro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Cidade: <input name=\"cidade\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.cidade}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Estado: <input name=\"estado\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.estado}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Plano de saúde 01: <input name=\"planosaude01\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.planosaude01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Número do plano de saúde 01: <input name=\"numplanosaude01\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.numplanosaude01}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Plano de saúde 02: <input name=\"planosaude02\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.planosaude02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            Número do plano de saúde 02: <input name=\"numplanosaude02\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UsuarioModel.numplanosaude02}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"> <br>\r\n");
      out.write("            \r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("            <h4>Clique em \"Salvar\" após inserir os dados.</h4>\r\n");
      out.write("            <input type=\"submit\" value=\"Salvar\">\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
