package designPattern.betterCode.v4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder().setName("iphone").setPrice(100).setBrand("apple").build();

    }
}
