package homeworks.oop.amusementPark;

public class RollerCoaster extends Attraction{
    @Override
    public void info() {
        System.out.println("Информация: острые ощущения.");
    }

    @Override
    public void maintain() {
        System.out.println("Тех. информация: проверка безопасности.");
    }
}
