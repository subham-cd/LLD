package designPattern.ProblematicCode.productClass;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(
                1, "iPhone 15", "Latest Apple Phone",
                79999, "Electronics", "Apple",
                50, 4.7, 10, true, 0.4, "Black"
        );

        Product p2 = new Product(
                2, "Nike Shoes", "Running Shoes",
                4999, "Footwear", "Nike",
                120, 4.5, 15, true, 0.8, "White"
        );

        p1.displayProduct();
        p2.displayProduct();
    }
}

