package practice.oop.practice_5.task_3;

public class PysicalProduct extends Product{
    private int weight;

    public PysicalProduct(String title, int price, int weight) {
        super(title, price);
        this.weight = weight;
    }
}
