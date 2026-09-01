package homeworks.oop.farm;

public abstract class Pet {
    abstract void care();
    abstract void produce();

    @Override
    public String toString(){
        return "Животное";
    }
}
