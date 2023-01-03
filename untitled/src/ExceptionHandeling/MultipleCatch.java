package ExceptionHandeling;

public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int b = Integer.parseInt("aaaaa");
//            int a = 3/0;

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }
    }
}
