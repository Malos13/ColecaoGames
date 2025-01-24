package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static void main(String[] args) {

        Connection conexao = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/3306/gamecollectiondb","root","root");
            System.out.println("Conexão realizada com sucesso!");

        } catch (ClassNotFoundException e) {

            throw new RuntimeException(e);
            //System.out.println("Erro no driver do banco de dados");

        } catch (SQLException e) {

            System.out.println("Erro ao conectar no banco de dados" + e.getMessage());

        }
    }

}

