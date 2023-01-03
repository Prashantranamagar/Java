package Students.TransactionExample;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Tranctionsection1 {
    public static void main(String[] args) throws SQLException{
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);

        try {
            String insertQuery = "INSERT " +
                    "INTO students(name, age, batch)" +
                    "VALUES ('Radha', 12, 2015)";
            statement.execute(insertQuery);
            String malformedInsertQuery = "INSERTING " +
                    "INTO students(name, age, batch)" +
                    "VALUES ('Madhu', 13, 2016)";
            statement.execute(malformedInsertQuery);
            connection.commit();

        } catch (SQLException e) {
            System.out.println("Rollbacking database");
            e.printStackTrace();
        }
    }
}

