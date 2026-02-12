package Lesson2_OCP.TakeHomeTasks.BetterCode;



public class Main {
    public static void main(String[] args) {

        Product electronics = new Product(1000, new ElectronicsDiscount());
        Product clothing = new Product(2000, new ClothingDiscount());

        System.out.println("Electronics Discount: " + electronics.calculateDiscount());
        System.out.println("Clothing Discount: " + clothing.calculateDiscount());
    }
}

