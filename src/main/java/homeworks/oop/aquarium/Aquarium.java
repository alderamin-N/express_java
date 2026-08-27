package homeworks.oop.aquarium;

public class Aquarium {
    private Creature creature;

    public void addCreature(Creature creature){
        this.creature = creature;
        System.out.println("Лог: морское существо добавлено в аквариум " + this.creature);
    }

    public void showDescriptionOfShark(){
        if(this.creature instanceof Shark){
            Shark shark = (Shark) this.creature;
            shark.move();
        }
        else{
            System.out.println("Это морское существо не акула");
        }
    }

    public void showDescriptionOfStarfish(){
        if(this.creature instanceof Starfish){
            Starfish starfish = (Starfish) this.creature;
            starfish.move();
        }
        else{
            System.out.println("Это морское существо не морская звезда");
        }
    }

}
