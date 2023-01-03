package StaticAndFinal;

public class FinalKeyword {
    final Double pi = 3.15;

    public void areaOfCircle(Double radius){
//        we cant modify variables
//        this.pi = 10.0

        System.out.println(
                "The area of Circle:" + this.pi * java.lang.Math.pow(radius,2)
        );
    }

    public static void main (String[] args){
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.areaOfCircle(2.0);
    }
}
