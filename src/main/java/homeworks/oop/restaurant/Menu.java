package homeworks.oop.restaurant;

public class Menu {
    private Dish dish;

    public void addDish(Dish dish){
        this.dish = dish;
        System.out.println("Лог: добавлено блюдо " + this.dish);
    }

    public void showCharacteristic(){
        dish.getDescription();
    }
}
