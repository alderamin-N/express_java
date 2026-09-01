package homeworks.oop.botanicalGarden;

public abstract class Plant {
    abstract void care();

    @Override
    public String toString(){
        return "Растение";
    }
}
