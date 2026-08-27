package practice.oop.practice_5.task_3;

public class FixedDiscount implements Discountable{
    private int fisSum;

    public FixedDiscount(int fisSum) {
        this.fisSum = fisSum;
    }

    @Override
    public double discount(double price) {
        return fisSum;
    }
}
