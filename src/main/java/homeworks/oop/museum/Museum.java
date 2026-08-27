package homeworks.oop.museum;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Лог: добавлен " + this.exhibit);
    }

    public void showInformationOfExhibit(){
        this.exhibit.care();
        this.exhibit.describe();
    }
}
