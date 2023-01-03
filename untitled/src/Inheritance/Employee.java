package Inheritance;

public class Employee {

    private int salary;

    private String name;

    public Employee(String name , Integer salary){
        this.name = name;
        this.salary = salary;
    }

    protected String getName(){
        return this.name;
    }

    protected  int getSalary(){
        return this.salary;
    }

    public void printName(){
        System.out.println("Your name is :" + this.getName());
    }

    public void printSalary(){
        System.out.println("Your salary is :" + this.salary);
    }

}
