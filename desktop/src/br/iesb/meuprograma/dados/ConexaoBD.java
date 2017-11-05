package br.iesb.meuprograma.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConexaoBD {

    public static Connection getConexao() throws DadosException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
<<<<<<< HEAD
            return DriverManager.getConnection("jdbc:mysql://localhost/db_projetointegrador", "root", "");
=======
            return DriverManager.getConnection("jdbc:mysql://localhost/bd_projeto", "root", "");
>>>>>>> b96c28a75c392ec4c11720ca94dad413dd9a8266
        } catch (ClassNotFoundException e) {
            throw new DadosException("Erro ao carregar JDBC: " + e.getMessage());
        } catch (SQLException e) {
            throw new DadosException("Erro ao conectar com SGBD: " + e.getMessage());
        }
    }
}
