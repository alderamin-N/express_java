package homeworks.oop.museum;

public class Sculpture extends Exhibit{
    @Override
    public void care() {
        System.out.println("Уход: нуждается в реставрации");
    }

    @Override
    public void describe() {
        System.out.println("Информация: 5 век до нашей эры");
    }
}
