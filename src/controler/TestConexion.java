package controler;

import java.sql.Connection;
import java.sql.SQLException;


public class TestConexion {

    public static void main(String[] args) throws SQLException {

        Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta");
        connection.close();

    }

}