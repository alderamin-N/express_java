package homeworks.oop.restaurant;

public class HotDish extends Dish{
    private int temperature;

    public HotDish(int temperature){
        this.temperature = temperature;
    }


    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public void getDescription() {
        System.out.println("Температура блюда: " + getTemperature());
    }
}
