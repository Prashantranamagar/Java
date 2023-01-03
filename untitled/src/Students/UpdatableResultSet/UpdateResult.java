package Students.UpdatableResultSet;

import DBConnection.DBConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateResult {
    public static void main(String[] args) {
        DBConnection dbconnection = new DBConnection();

        try {
            Connection connection = dbconnection.getConnection();

            String query = "SELECT * FROM students";
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                if(resultSet.getInt("id") == 1)
                {
                    resultSet.updateString("name", "Karan");
                    resultSet.updateInt("age", 20);
                    resultSet.updateInt("batch", 2012);
                    resultSet.updateRow();
                }
            }
            resultSet.beforeFirst();
            System.out.println("Result after update");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getInt("age"));
                System.out.println(resultSet.getInt("Batch"));
                System.out.println("--------------------");
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }
}


//You can also update using update query
