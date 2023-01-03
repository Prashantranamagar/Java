package Inheritance;

public class Programmer extends Employee{
    private int bonus;

    Programmer(String name, Integer salary, Integer bonus){
        super(name, salary);
        this.bonus = bonus;
    };

    // Overridden method

    public void printName() {
        System.out.println("Your name is :" + this.getName());}


    //Overridden method
    public void printSalary(){
        super.printSalary();
    }

    // use of inherited this.getSalary() super class method

    public void printSalaryWithBonus(){
        System.out.println("Your Salary with bonus is:" + (this.getSalary() +this.bonus));
    }
}
