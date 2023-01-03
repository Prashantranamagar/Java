package Students.Insert;

import DBConnection.DBConnection;
import Students.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BulkInsert {
    private DBConnection dbConnection = new DBConnection();

    public void insert(List<Student> studentList) throws SQLException {
        String query = "Insert INTO students(name, age, batch) values(?,?,?)";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement =
                connection.prepareStatement(query);

        for(Student student : studentList)
        {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setInt(3, student.getBatch());  // getBatch() student method
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();  //executeBatch is the method of preparedStatement 
    }
}
