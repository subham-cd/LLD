package designPattern.betterCode.v2;


import java.util.HashMap;

public class Product {

    private int id;
    private String name;
    private String description;
    private double price;
    private String category;
    private String brand;
    private int stock;
    private double rating;
    private double discount;
    private boolean isAvailable;
    private double weight;
    private String color;

    Product(HashMap<String, Object> mp) {
        if (mp.get("price").equals(0)) {
//            this.price = mp.get("price")
        }

    }

    ///..............



    void displayProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Category: " + category);
        System.out.println("Brand: " + brand);
        System.out.println("Stock: " + stock);
        System.out.println("Rating: " + rating);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Available: " + isAvailable);
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Color: " + color);
        System.out.println("----------------------");
    }
}


