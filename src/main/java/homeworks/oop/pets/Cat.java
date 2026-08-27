package homeworks.oop.pets;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("Кошка есть влажный корм");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет с мышкой");
    }
}
