package Students.Retrive;

import Students.Student;
import com.mysql.cj.x.protobuf.MysqlxPrepare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Retrive retrive = new Retrive();
        List<Student> studentList = new ArrayList<>();
        try{
            studentList = retrive.retriveAll();
        }
        catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("Total Student = " + studentList.size());

        for (Student student : studentList)
        {
            System.out.println("Name-> "+student.getName());
            System.out.println("Age-->"+student.getAge());
            System.out.println("Batch-->"+student.getBatch());
            System.out.println("------------------------------------");
        }
    }



}


