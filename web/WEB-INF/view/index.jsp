<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="html\css\index.css" rel="stylesheet">
        <title>Login</title>
    </head>
    
	<body>
	<h1>SISTEMA DE CONSULTAS INTEGRADO</h1>
	
	<h3>Serviços</h3>
        <h4>(É necessário realizar o acesso ao sistema)</h4>
	
	<table border="1">
        <tr>
        
        <td><a target="_self" href="consultas.jsp">
	<img border="0" alt="Consultas" src="html\arquivos\consultas.png" width="70" height="70"></a>
        <br><a target="_self" href="consultas.jsp">Consultas</a>
        </td>
        
        <td><a target="_self" href="exames.jsp">
	<img border="0" alt="Exames" src="html\arquivos\exames.png" width="70" height="70"></a>
        <br><a target="_self" href="exames.jsp">Exames</a>
        </td>
        
        <td><a target="_self" href="receituario.jsp">
	<img border="0" alt="Receituario" src="html\arquivos\receituario.png" width="70" height="70"></a>
	<br><a target="_self" href="receituario.jsp">Receituário</a>
        </td>
        
        <td><a target="_self" href="cadastro.jsp">
	<img border="0" alt="Cadastro" src="html\arquivos\cadastro.png" width="70" height="70"></a>
	<br><a target="_self" href="cadastro.jsp">Cadastro de usuários</a>
        </td>
        
        <td><a target="_self" href="dadospessoais.jsp">
	<img border="0" alt="Dados pessoais" src="htmlteste\arquivos\dadospessoais.png" width="70" height="70"></a>
	<br><a target="_self" href="dadospessoais.jsp">Dados pessoais</a>
        </td>
        
        </tr>
        </table>
        
        <h3>Acesso ao sistema</h3>

        <form action="/efetualogon" method="post">
            <div>
                <label for="nome">Identificação (login):</label>
                <input type="text" id="usuarioid" name="usuarioid" />
            </div>
            <div>
                <label for="senha">Senha:</label>
                <input type="text" id="usuariosenha" name="usuariosenha" />
            </div>
            <div class="button">
                <button type="submit">Entrar!</button>
            </div>
            <h4>Insira sua identificação e senha conforme consta no termo de convênio ou cadastro.</h4>
            <h4>Se esqueceu a senha ou está tendo dificuldades para acesso ao sistema, clique aqui!</h4>
            <!--
            Ativar o atalho do "Clique aqui"
            -->
        </form>
        
<!--
        Rever e remover
        <div>
	<form action="/login" method="post"></form>
	</div>
		
        <div>
        <form action="/agenda" method="get"></form>
        <div>
-->       
	</body>
</html>

