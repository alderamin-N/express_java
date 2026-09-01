package homeworks.oop.pets;

public class Cat extends Pet{
    @Override
    void eat() {
        System.out.println("Кошка есть влажный корм");
    }

    public void play() {
        System.out.println("Кошка играет с мышкой");
    }
}
