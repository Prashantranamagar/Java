package Students.TransactionExample;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Transaction2 {
    public static void main(String[] args) throws SQLException {
        DBConnection dbConnection = new DBConnection();
        Connection connection = dbConnection.getConnection();
        Statement statement = connection.createStatement();
        connection.setAutoCommit(false);

        String insertQuery = "INSERT " +
                "INTO students(name, age, batch) " +
                "VALUES ('Radha', 12, 2014)";
        statement.execute(insertQuery);

        Savepoint savepoint = connection.setSavepoint("oneRowAdded");

        String insertQuery2 = "INSERT INTO students(name, age, batch) " +
                "VALUES ('Madhu', 13, 2015)";
        statement.execute(insertQuery2);

        try{
            String malformedQuery = "INSERTING "+
                    "INTO students(name,age,batch) "+
                    "VALUES ('sita', 14, 2026)";
            statement.execute(malformedQuery);
            connection.commit();

        }
        catch (SQLException e)
        {
            System.out.println("Rolling Back to SavePoint");
            connection.rollback(savepoint);
            e.printStackTrace();
        }


    }
}
