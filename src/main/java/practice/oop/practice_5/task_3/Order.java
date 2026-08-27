package practice.oop.practice_5.task_3;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private List<Product> products;
    private List<Discountable> discounts;

    public Order() {
        this.products = new LinkedList<>();
        this.discounts = new LinkedList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addProducts(List<Product> products){
        this.products.addAll(products);
    }

    public void addDiscout(Discountable discountable){
        this.discounts.add(discountable);
    }

    public void addDiscouts(List<Discountable> discounts){
        this.discounts.addAll(discounts);
    }

    public double calculatePrice(){
//        AtomicReference<Double> totalProductsSum = new AtomicReference<>((double) products.stream().mapToInt(Product::getPrice).sum());
//        discounts.forEach(it -> {
//            totalProductsSum.updateAndGet(v -> new Double((double) (v - it.discount(totalProductsSum.get()))))
//        });

        double totalProductsSum = products.stream().mapToInt(Product::getPrice).sum();

        for(Discountable discount :discounts){
            totalProductsSum = totalProductsSum - discount.discount(totalProductsSum);
        }
        return totalProductsSum;
    }

}
