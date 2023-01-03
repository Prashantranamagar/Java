package Students.Insert;

import Students.Student;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Student Age:");
        Integer age = scanner.nextInt();

        System.out.println("Enter Student Batch:");
        Integer batch = scanner.nextInt();

        student.setName(name);
        student.setAge(age);
        student.setBatch(batch);

        Insert writeToDB = new Insert();
        try{
            writeToDB.insert(student);
            System.out.println("Student added Successfully");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
