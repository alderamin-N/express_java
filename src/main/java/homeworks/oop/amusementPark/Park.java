package homeworks.oop.amusementPark;

public class Park {
    private Attraction attraction;

    public void addAtraction(Attraction attraction){
        this.attraction = attraction;
        System.out.println("Лог: добавлено " + this.attraction);
    }

    public void showInformationOfAttraction(){
        this.attraction.info();
        this.attraction.maintain();
    }
}
