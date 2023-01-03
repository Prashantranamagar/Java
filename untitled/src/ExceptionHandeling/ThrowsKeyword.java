package ExceptionHandeling;

public class ThrowsKeyword {
    public void divideByZero() throws ArithmeticException
    {
        throw new ArithmeticException("Divide By Zero");
    }

    public static void main(String[] args) {
        try{
            ThrowsKeyword throwsKeyword = new ThrowsKeyword();
            throwsKeyword.divideByZero();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
    }
}
