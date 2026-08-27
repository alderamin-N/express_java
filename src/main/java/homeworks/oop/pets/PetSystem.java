package homeworks.oop.pets;

public class PetSystem {
    private Pet pet;

    public void addPet(Pet pet){
        this.pet = pet;
        System.out.println("Лог: Питомец добавлен " + this.pet);
    }

    public void showBehavior(){
        pet.eat();
    }

    public void forcePetToPlay(){
        if(this.pet instanceof Playable){
            Playable playable = (Playable) this.pet;
            playable.play();
        }
        else{
            System.out.println("Ошибка: Питомец не играет");
        }
    }

    public void forcePetToWalk(){
        if(this.pet instanceof Walkable){
            Walkable walkableable = (Walkable) this.pet;
            walkableable.walk();
        }
        else{
            System.out.println("Ошибка: Питомец не гуляет");
        }
    }



}
