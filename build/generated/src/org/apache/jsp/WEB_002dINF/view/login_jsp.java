package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"WEB-INF/html/css/login.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<h3>Acesso ao sistema</h3>\n");
      out.write("\t\t\n");
      out.write("\t<form action=\"/efetualogon\" method=\"post\">\n");
      out.write("    <div>\n");
      out.write("        <label for=\"nome\">IdentificaÃ§Ã£o (login):</label>\n");
      out.write("        <input type=\"text\" id=\"usurioid\" name=\"usuarioid\" />\n");
      out.write("    </div>\n");
      out.write("    <div>\n");
      out.write("        <label for=\"senha\">Senha:</label>\n");
      out.write("        <input type=\"text\" id=\"usuariosenha\" name=\"usuariosenha\" />\n");
      out.write("    </div>\n");
      out.write("    <div class=\"button\">\n");
      out.write("        <button type=\"submit\">Entrar!</button>\n");
      out.write("    </div>\n");
      out.write("    <h4>Insira sua identificaÃ§Ã£o e senha conforme consta no termo de convÃªnio ou cadastro.</h4>\n");
      out.write("    <h4>Se esqueceu a senha ou estÃ¡ tendo dificuldades para acesso ao sistema, clique aqui!</h4>\n");
      out.write("    <!--\n");
      out.write("    Ativar o atalho do \"Clique aqui\"\n");
      out.write("    -->\n");
      out.write("    \n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
