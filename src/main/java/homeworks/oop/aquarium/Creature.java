package homeworks.oop.aquarium;

public abstract class Creature {

    abstract void move();

    @Override
    public String toString(){
        return "Морское существо";
    }
}
