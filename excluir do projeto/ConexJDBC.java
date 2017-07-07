
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexJDBC {

    public void conectado() throws SQLException {
        Connection conexao = DriverManager.getConnection(
          "jdbc:mysql://localhost/fj21");
        System.out.println("Conectado ao banco de dados!");
        conexao.close();
    }
}
