package homeworks.oop.farm;

public class Chiken extends Pet{
    @Override
    public void care() {
        System.out.println("Курица требует зерно.");
    }

    @Override
    public void produce() {
        System.out.println("Курица несет яйца.");
    }
}
