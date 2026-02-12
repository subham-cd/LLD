package Lesson2_OCP.TakeHomeTasks.BetterCode;

public class ElectronicsDiscount implements DiscountStrategy {

    @Override
    public double calculateDiscount(Product product) {
        return product.getPrice() * 0.10;
    }
}
