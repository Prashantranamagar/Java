package MethodOverloading;

public class Box {
    public Double length;
    public Double breadth;
    public Double height;

    public void volume(Double length){
        this.length = length;
        this.breadth = length;
        this.height = length;
        System.out.println("This volume of box is" +this.length *this.height *this.breadth);
    }

    public void volume(Double length, Double breadth, Double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        System.out.println("Volume of box is" +this.length * this.breadth * this.breadth);
    }
}
