package homeworks.oop.aquarium;

public class Shark extends Creature implements Moveable{
    @Override
    public void move() {
        System.out.println("Акула плавает быстро и агрессивно.");
    }
}
