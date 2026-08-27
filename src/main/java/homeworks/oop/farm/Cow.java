package homeworks.oop.farm;

public class Cow extends Pet{
    @Override
    public void care() {
        System.out.println("Корова нуждается в выпасе.");
    }

    @Override
    public void produce() {
        System.out.println("Корова дает молоко.");
    }
}
