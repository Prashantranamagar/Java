package Students.Retrive;

import DBConnection.DBConnection;
import Students.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Retrive {
    private DBConnection dbConnection = new DBConnection();

    List<Student> studentList = new ArrayList<>();

    public List<Student> retriveAll() throws SQLException
    {
        String query = "SELECT * FROM students";

        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next())
        {
            Student student = new Student();
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            student.setBatch(resultSet.getInt("batch"));
            studentList.add(student);

        }
        return studentList;
    }

    public Student getStudent(Integer id) throws SQLException{
        String query = "SELECT * FROM students where id = ?";
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Student student = new Student();

        if(resultSet.next())
        {
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            student.setBatch(resultSet.getInt("batch"));
//            return student;
        }
        return student;
    }

    public List<Student> sqlInjection(String id) throws SQLException{
        String query = "SELECT * FROM students where id =" + id;
        Connection connection = dbConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next())
        {
            Student student = new Student();
            student.setName(resultSet.getString("name"));
            student.setAge(resultSet.getInt("age"));
            student.setBatch(resultSet.getInt("batch"));
            studentList.add(student);
        }
        return studentList;
    }
}

