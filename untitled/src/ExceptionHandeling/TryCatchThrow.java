package ExceptionHandeling;

public class TryCatchThrow {
    private int age=0;
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        TryCatchThrow tryCatchAndFinally = new TryCatchThrow();
        tryCatchAndFinally.setAge(10);
        try{
            if (tryCatchAndFinally.getAge()<20)
            {
                throw  new ArithmeticException("Age is less than 20");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
    }
}
