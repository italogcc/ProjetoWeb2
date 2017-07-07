<!--
    Incorpodar ao INDEX e remover após testes
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="WEB-INF/html/css/login.css" rel="stylesheet">
        <title>Login</title>
    </head>
    <body>
	<h3>Acesso ao sistema</h3>
		
	<form action="/efetualogon" method="post">
    <div>
        <label for="nome">IdentificaÃ§Ã£o (login):</label>
        <input type="text" id="usurioid" name="usuarioid" />
    </div>
    <div>
        <label for="senha">Senha:</label>
        <input type="text" id="usuariosenha" name="usuariosenha" />
    </div>
    <div class="button">
        <button type="submit">Entrar!</button>
    </div>
    <h4>Insira sua identificaÃ§Ã£o e senha conforme consta no termo de convÃªnio ou cadastro.</h4>
    <h4>Se esqueceu a senha ou estÃ¡ tendo dificuldades para acesso ao sistema, clique aqui!</h4>
    <!--
    Ativar o atalho do "Clique aqui"
    -->
    
    </form>
    </body>
</html>
