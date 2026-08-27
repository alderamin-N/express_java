package homeworks.oop.museum;

public class Manuscript extends Exhibit{
    @Override
    public void care() {
        System.out.println("Уход: контролируемая влажность");
    }

    @Override
    public void describe() {
        System.out.println("Информация: 10 век до нашей эры");
    }
}
