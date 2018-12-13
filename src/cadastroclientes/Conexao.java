/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author viniciuscrepschi
 */

// padrao singleton
public class Conexao {

    private Conexao(){}

    private static final String URL_MYSQL = "jdbc:derby://localhost:1527//Users/viniciuscrepschi/Documents/databases/clientes";
    private static final String DRIVER_CLASS = "org.apache.derby.jdbc.ClientDriver";
    private static final String USER = "nbuser";
    private static final String PASS = "nbuser";

    private static Connection instanceConnection;

    public static Connection getConnection() {
        if (instanceConnection==null){
            try {
                Class.forName(DRIVER_CLASS);
                instanceConnection= DriverManager.getConnection(URL_MYSQL, USER, PASS);
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return instanceConnection;
    }
}
