package Students.Insert;

import Students.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BulkMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        for(int i=0;i<3;i++)
        {
            Student student = new Student();
            System.out.println("Enter Student Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Student Age");
            Integer age = scanner.nextInt();

            System.out.println("Enter Student Batch");
            Integer batch = scanner.nextInt();

            scanner.nextLine();
            student.setName(name);
            student.setAge(age);
            student.setBatch(batch);
            studentList.add(student);
        }

        BulkInsert bulkInsert = new BulkInsert();
        try{
            bulkInsert.insert(studentList);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
