package homeworks.oop.botanicalGarden;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Лог: добавлено " + this.plant);
    }

    public void showCare(){
        this.plant.care();
    }
}
