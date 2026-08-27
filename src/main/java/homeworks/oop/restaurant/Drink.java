package homeworks.oop.restaurant;

public class Drink extends Dish{
    private int volume;

    public Drink(int volume){
        this.volume = volume;
    }


    public int getVolume() {
        return this.volume;
    }

    @Override
    public void getDescription() {
        System.out.println("Объем напитка: " + getVolume());
    }
}
