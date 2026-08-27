package homeworks.oop.zoo;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal){
        this.animal = animal;
        System.out.println("Животное " + this.animal + " в зоопарк");
    }

    public void showBehavior(){
        this.animal.makeSound();
        this.animal.makeMove();
    }

    public void removeAnimal(){
        this.animal = null;
    }
}
