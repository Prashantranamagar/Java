package MethodOverloading;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.volume(10.0);

        Box box2 = new Box();
        box2.volume(10.0, 20.0, 30.0);


    }
}
