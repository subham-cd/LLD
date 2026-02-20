package designPattern.betterCode.v4;

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

    // 🔥 Private constructor (only Builder can create object)
    private Product(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.description = b.description;
        this.price = b.price;
        this.category = b.category;
        this.brand = b.brand;
        this.stock = b.stock;
        this.rating = b.rating;
        this.discount = b.discount;
        this.isAvailable = b.isAvailable;
        this.weight = b.weight;
        this.color = b.color;
    }

    // 🔥 Static method to get Builder
    public static Builder getBuilder() {
        return new Builder();
    }

    // 🔥 Nested Builder Class
    public static class Builder {

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

        private Builder() {}

        // 🔹 Setters (Builder style)
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setStock(int stock) {
            this.stock = stock;
            return this;
        }

        public Builder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        public Builder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder setAvailable(boolean available) {
            this.isAvailable = available;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        // 🔥 build() method
        public Product build() {
            return new Product(this);
        }
    }

    // 🔹 Display method
    public void display() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println("Brand: " + brand);
        System.out.println("Stock: " + stock);
        System.out.println("Rating: " + rating);
        System.out.println("Discount: " + discount);
        System.out.println("Available: " + isAvailable);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}