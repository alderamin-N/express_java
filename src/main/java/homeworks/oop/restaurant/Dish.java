package homeworks.oop.restaurant;

public abstract class Dish {
    abstract void getDescription();

    @Override
    public String toString() {
        return "Dish";
    }
}
