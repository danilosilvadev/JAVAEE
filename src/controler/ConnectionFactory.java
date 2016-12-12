package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 12/12/2016.
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            //norbert
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/javaee_learning", "root", "");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //norbert
        catch (ClassNotFoundException e) {
            return null;
        }
    }
}
