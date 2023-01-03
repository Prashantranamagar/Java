package Constructor;

public class Main {
    public static void main(String[] args) {
        Box box = new Box() ;
                box.volume() ;
        Box box1 = new Box( 10) ;
        box1.volume() ;

        Box box2 = new Box( 10,  20,  40) ;
        box2.volume() ;
    }
}