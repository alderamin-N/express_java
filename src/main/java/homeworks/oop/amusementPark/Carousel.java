package homeworks.oop.amusementPark;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println("Информация: веселое настроение.");
    }

    @Override
    public void maintain() {
        System.out.println("Тех. информация: техническое обслуживание.");
    }
}
