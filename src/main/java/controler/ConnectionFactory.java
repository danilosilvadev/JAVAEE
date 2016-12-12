package controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by sg-0036936 on 12/12/2016.
 */
public class ConnectionFactory {

    private static String url = "localhost";
    private static String baseDeDados = "javaee_learning";
    private static String usuario = "root";
    private static String senha = "";

    public Connection getConnection() {
        try {
            //norbert
            System.out.println("BEFORE CLASS.FORNAME CONECTADO SIM");
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("TRY CONECTADO SIM");

            return DriverManager.getConnection("jdbc:mysql://"+ url +"/"+baseDeDados+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", ""+
                    usuario+"", ""+senha+"");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //norbert
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("CATCH SIM");
            return null;
        }
    }
}
