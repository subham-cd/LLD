package Lesson2_OCP.TakeHomeTasks.BetterCode;

public class Product {

    private double price;
    private DiscountStrategy discountStrategy;

    public Product(double price, DiscountStrategy discountStrategy) {
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        return price;
    }

    public double calculateDiscount() {
        return discountStrategy.calculateDiscount(this);
    }
}
