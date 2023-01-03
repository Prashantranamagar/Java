package Interface;

public class Cow implements Animal{

    @Override
    public void animalSound() {
        System.out.println("Cow Says : MOO MOO");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping : ZZZ");
    }
}
