package homeworks.oop.pets;

public class Dog extends Pet{
    @Override
    void eat() {
        System.out.println("Собака есть сухой корм");
    }

    public void walk() {
        System.out.println("Собака гуляет");
    }
}
