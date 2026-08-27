package homeworks.oop.aquarium;

public class Starfish extends Creature implements Moveable{
    @Override
    public void move() {
        System.out.println("Морская звезда медленно ползает.");
    }
}
