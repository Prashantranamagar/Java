package StaticAndFinal;

public class Math {
    public Double pi = 3.17;
    public static  Double staticPi = 3.14;

    public static Integer c =10;

    public static void add(Integer a, Integer b)
    {
        System.out.println("Addition:" + (a + b));

    }

    public static void subtract(Integer a, Integer b){
        //acessing static fields
        System.out.println("Subtraction:" + (a-b-c));

    }

    public void multiply(Integer a, Integer b){
        System.out.println("Multiplication:" + (a*b));
    }

    public static void areaOfCircle(Double radius){
        System.out.println("---------Area of circle ----------");
        System.out.println("Area of Circle is :" + staticPi * radius *2);
        //static method can only access static data and cannot refer to this keyboard
        //System.out.println("Area of circle is :", this.pi*radius^2);
    }

    public static void allOperation(Integer a, Integer b)
    {
        System.out.println("-----------All Operations --------------");
        add(a,b);
        subtract(a,b);
        //static methods and only call other static methods , so we cannot all non-static method multiply()
        //from here multiply(a,b);

    }

    public static void main(String[] args){
        allOperation(10, 2);
        areaOfCircle(18.2);
    }
}
