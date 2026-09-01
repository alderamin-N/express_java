package homeworks.oop.pets;

public class PetSystem {
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Лог: добавлен " + this.pet);
    }

    public void showBehavior(){
        pet.eat();
    }

    public void checkAnimal(){
        if(this.pet instanceof Dog){
            Dog dog = (Dog)this.pet;
            dog.walk();
        }
        else{
            Cat cat = (Cat)this.pet;
            cat.play();
        }
    }

}
