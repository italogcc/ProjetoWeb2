<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Consultas Integrado - Cadastro de usuários</title>
    </head>
    <body>
        <h2>Cadastro de usuários</h2>
	<h4>Este é o formulário padrão para cadastro de usuários no sistema.</h4>
	<h4>Por favor preencher todos os campos.</h4>
		
        <form method="POST" action="confirm">
            Matricula: <input name="matricula" value="${UsuarioModel.matricula}"> <br><br>
            Nome: <input name="nome" value="${UsuarioModel.nome}"> <br>
            Sobrenome: <input name="sobrenome" value="${UsuarioModel.sobrenome}"> <br>
            Identificação 01: <input name="idpessoal01" value="${UsuarioModel.idpessoal01}"> <br>
            Identificação 02: <input name="idpessoal02" value="${UsuarioModel.idpessoal02}"> <br>
            Sexo: <input name="sexo" value="${UsuarioModel.sexo}"> <br>
            Data de nascimento: <input name="datanasc" value="${UsuarioModel.datanasc}"> <br>
            Filiação pai: <input name="filpai" value="${UsuarioModel.filpai}"> <br>
            Filiação mãe: <input name="filmae" value="${UsuarioModel.filmae}"> <br>
            Telefone 01: <input name="telefone01" value="${UsuarioModel.telefone01}"> <br>
            Telefone 02: <input name="telefone02" value="${UsuarioModel.telefone02}"> <br>
            Logradouro: <input name="logradouro" value="${UsuarioModel.logradouro}"> <br>
            Número: <input name="lognumero" value="${UsuarioModel.lognumero}"> <br>
            Complemento: <input name="logcomplemento" value="${UsuarioModel.logcomplemento}"> <br>
            Bairro: <input name="bairro" value="${UsuarioModel.bairro}"> <br>
            Cidade: <input name="cidade" value="${UsuarioModel.cidade}"> <br>
            Estado: <input name="estado" value="${UsuarioModel.estado}"> <br>
            Plano de saúde 01: <input name="planosaude01" value="${UsuarioModel.planosaude01}"> <br>
            Número do plano de saúde 01: <input name="numplanosaude01" value="${UsuarioModel.numplanosaude01}"> <br>
            Plano de saúde 02: <input name="planosaude02" value="${UsuarioModel.planosaude02}"> <br>
            Número do plano de saúde 02: <input name="numplanosaude02" value="${UsuarioModel.numplanosaude02}"> <br>
            
            <%--
            Lembrar que cada usuário deverá estar associado a algum número de matrícula por conta de estrangeiros ou pessoas sem CPF.
            Por hora, este número está sendo inserido mas deverá ser sequencial e gerado pelo sistema.
            --%>
            <%--
            Inserir opção para cadastrar outro documento caso não exista CPF.
            --%>
   
            <h4>Clique em "Salvar" após inserir os dados.</h4>
            <input type="submit" value="Salvar">
        </form>
    </body>
</html>
