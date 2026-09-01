package homeworks.oop.aquarium;

public class Aquarium {
    private Creature creature;

    public void addCreature(Creature creature){
        this.creature = creature;
        System.out.println("Лог: добавлено в аквариум " + this.creature);
    }

    public void showBehavior(){
        creature.move();
    }
}
