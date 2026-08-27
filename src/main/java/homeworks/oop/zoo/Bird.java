package homeworks.oop.zoo;

public class Bird extends Animal{
    @Override
    void makeSound() {
        System.out.println("Птица чирикает");
    }

    @Override
    void makeMove() {
        System.out.println("Птица летит");
    }
}
