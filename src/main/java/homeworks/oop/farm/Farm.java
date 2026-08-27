package homeworks.oop.farm;

public class Farm {
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Лог: добавлено животное на ферму " + this.pet);
    }

    public void showCare(){
        this.pet.care();
    }

    public void showProduce(){
        this.pet.produce();
    }

}
