package Students.Insert;

import DBConnection.DBConnection;
import Students.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    private  DBConnection dbConnection = new DBConnection();

    public void insert(Student student) throws SQLException {
        String query = "INSERT INTO students(name, age, batch) values(?,?,?)";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setInt(2, student.getAge());
        preparedStatement.setInt(3,student.getBatch());
        preparedStatement.execute();

    }

//    public static void main(String[] args) {
//        Insert insertToDB = new Insert();
//        try{
//            insertToDB.insert();
//
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
}
