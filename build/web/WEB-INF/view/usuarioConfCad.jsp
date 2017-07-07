<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sistema de Consultas Integrado - Confirmação de cadastro</title>
    </head>
    <body>
        <h1>Cadastro de usuários</h1>
	<h3>Estes são os dados inseridos:</h3>
		
	Matricula: ${UsuarioModel.matricula} <br>
        Nome: ${UsuarioModel.nome} <br>
	Sobrenome: ${UsuarioModel.sobrenome} <br>
	Identificação 01: ${UsuarioModel.idpessoal01} <br>
        Identificação 02: ${UsuarioModel.idpessoal02} <br>
        Sexo: ${UsuarioModel.sexo} <br>
        Data de nascimento: ${UsuarioModel.datanasc} <br>
        Filiação pai: ${UsuarioModel.filpai} <br>
	Filiação mãe: ${UsuarioModel.filmae} <br>
	Telefone 01: ${UsuarioModel.telefone01} <br>
	Telefone 02: ${UsuarioModel.telefone02} <br>
	Logradouro: ${UsuarioModel.logradouro} <br>
	Número: ${UsuarioModel.lognumero} <br>
	Complemento: ${UsuarioModel.logcomplemento} <br>
	Bairro: ${UsuarioModel.bairro} <br>
	Cidade: ${UsuarioModel.cidade} <br>
	Estado: ${UsuarioModel.estado} <br>
	Plano de saúde 01: ${UsuarioModel.planosaude01} <br>
        Número do plano de saúde 01: ${UsuarioModel.numplanosaude01} <br>
        Plano de saúde 02: ${UsuarioModel.planosaude02} <br>
        Número do plano de saúde 02: ${UsuarioModel.numplanosaude02} <br>
	<br><br>
		
	<h3>Alguma informação errada?</h3>
	<h3>Clique em "Corrigir"</h3>
	<a href="editar">Corrigir</a>
        
        <h3>Se está tudo correto, clique em "salvar"</h3>
	<a href="salvar">salvar</a>
    </body>
</html>
