package homeworks.oop.botanicalGarden;

public class BotanicalGargen {
    private Plant plant;

    public void addPlant(Plant plant){
        this.plant = plant;
        System.out.println("Лог: добавлено растение " + this.plant);
    }

    public void showCare(){
        this.plant.care();
    }
}
