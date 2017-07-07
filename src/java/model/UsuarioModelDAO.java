package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;

import model.UsuarioModel;
import model.BDConFactory;

public class UsuarioModelDAO {

    // Configura essas variáveis de acordo o banco MySQL  
    private final String URL = "jdbc:mysql://localhost/bd_projeto",
            NOME = "root", SENHA = "1123";

    private Connection con;
    private Statement comando;

// TESTAR A MANIPULAÇÃO DO BD COM MATRÍCULA, NOME E SOBRENOME. SE RODAR CORRETAMENTE, INSERIR AS DEMAIS.     
    public void apagar(String matricula) {
        conectar();
        try {
            comando
                    .executeUpdate("DELETE FROM cadusuario WHERE matricula = '" + matricula + "';");
        } catch (SQLException e) {
            imprimeErro("Erro ao apagar registro", e.getMessage());
        } finally {
            fechar();
        }
    }

    public Vector<UsuarioModel> buscarTodos() {
        conectar();
        Vector<UsuarioModel> resultados = new Vector<UsuarioModel>();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT * FROM cadusuario");
            while (rs.next()) {
                UsuarioModel temp = new UsuarioModel();
                // pega todos os atributos do registro  
                temp.setMatricula(rs.getString("matricula"));
                temp.setNome(rs.getString("nome"));
                temp.setSobrenome(rs.getString("sobrenome"));
                temp.setIdPessoal01(rs.getString("idpessoal01"));
                temp.setIdPessoal02(rs.getString("idpessoal02"));
                resultados.add(temp);
            }
            return resultados;
        } catch (SQLException e) {
            imprimeErro("Erro ao buscar registro", e.getMessage());
            return null;
        }
    }

    public void atualizar(UsuarioModel usuariomodel) {
        conectar();
        String com = "UPDATE cadusuario SET nome = '" + usuariomodel.getNome()  
            + "', sobrenome ='" + usuariomodel.getSobrenome() + "', idpessoal01 = '"  
            + usuariomodel.getIdPessoal01() + "', idpessoal02 ='" + usuariomodel.getIdPessoal02()  
            + "' WHERE matricula = '" + usuariomodel.getMatricula() + "';"; 

        System.out.println("Atualizada!");
        try {
            comando.executeUpdate(com);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fechar();
        }
    }

    public Vector<UsuarioModel> buscar(String matricula) {
        conectar();
        Vector<UsuarioModel> resultados = new Vector<UsuarioModel>();
        ResultSet rs;
        try {
            rs = comando.executeQuery("SELECT * FROM cadusuario WHERE matricula LIKE '" + matricula + "%';");
            while (rs.next()) {
                UsuarioModel temp = new UsuarioModel();
                // Busca atributos do registro  
                temp.setMatricula(rs.getString("matricula"));
                temp.setNome(rs.getString("nome"));
                temp.setSobrenome(rs.getString("sobrenome"));
                temp.setIdPessoal01(rs.getString("idpessoal01"));
                temp.setIdPessoal02(rs.getString("idpessoal02"));
                resultados.add(temp);
            }
            return resultados;
        } catch (SQLException e) {
            imprimeErro("Erro ao buscar registro", e.getMessage());
            return null;
        }

    }

    public void insere(UsuarioModel usuariomodel) {
        conectar();
        try {
            comando.executeUpdate("INSERT INTO cadusuario VALUES('" + usuariomodel.getMatricula()
                    + "', '" + usuariomodel.getNome()
                    + "', '" + usuariomodel.getSobrenome()
                    + "', '" + usuariomodel.getIdPessoal01()
                    + "', '" + usuariomodel.getIdPessoal02() + "')");
            System.out.println("Inserida!");
        } catch (SQLException e) {
            imprimeErro("Erro ao inserir registro!", e.getMessage());
        } finally {
            fechar();
        }
    }

    private void conectar() {
        try {
            con = BDConFactory.conexao(URL, NOME, SENHA, BDConFactory.MYSQL);
            comando = con.createStatement();
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            imprimeErro("Erro ao carregar o driver", e.getMessage());
        } catch (SQLException e) {
            imprimeErro("Erro ao conectar", e.getMessage());
        }
    }

    private void fechar() {
        try {
            comando.close();
            con.close();
            System.out.println("Conexão Fechada");
        } catch (SQLException e) {
            imprimeErro("Erro ao fechar conexão", e.getMessage());
        }
    }

    private void imprimeErro(String msg, String msgErro) {
        JOptionPane.showMessageDialog(null, msg, "Erro crítico", 0);
        System.err.println(msg);
        System.out.println(msgErro);
        System.exit(0);
    }
}

