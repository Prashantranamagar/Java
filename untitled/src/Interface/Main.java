package Interface;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.animalSound();
        cow.sleep();
        System.out.println(cow.totalAnimals);
    }
}
