package designPattern.betterCode.v3;

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

    // Constructor takes Builder object
    public Product(Builder b) {
        this.id = b.getId();
        this.name = b.getName();
        this.description = b.getDescription();
        this.price = b.getPrice();
        this.category = b.getCategory();
        this.brand = b.getBrand();
        this.stock = b.getStock();
        this.rating = b.getRating();
        this.discount = b.getDiscount();
        this.isAvailable = b.isAvailable();
        this.weight = b.getWeight();
        this.color = b.getColor();
    }

    public void display() {
        System.out.println("Product: " + name + " | Price: " + price + " | Brand: " + brand);
    }
}