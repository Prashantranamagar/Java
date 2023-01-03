package DBConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String userName="root";
    private final String password="";
    private final String dbNameAndHost="localhost:3306/sevensem";

    public Connection getConnection() throws SQLException{
        Connection connection= DriverManager.getConnection(
        "jdbc:mysql://"+dbNameAndHost,userName,password);
        System.out.println("database connected");

        return connection;

    }

}
