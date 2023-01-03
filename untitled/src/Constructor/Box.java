package Constructor;

public class Box {
    public Double length;
    public Double breadth;
    public Double height;

    Box()
    {
        this.length = 10.0;
        this.height = 20.0;
        this.breadth = 30.0;
    }

    public Box(double length){
        this.length = length;
        this.breadth = length;
        this.height = length;
    }

    public Box(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }


    public void volume(){
        System.out.println("this Volume of boc is " +this.length *this.breadth *this.height);
    }
}
