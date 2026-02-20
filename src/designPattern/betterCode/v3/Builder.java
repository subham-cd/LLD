package designPattern.betterCode.v3;

public class Builder {

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

    public Builder() {}

    // 🔹 Setters (builder style)
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
        isAvailable = available;
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

    // 🔹 Getters (Product constructor ke liye)
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public String getBrand() { return brand; }
    public int getStock() { return stock; }
    public double getRating() { return rating; }
    public double getDiscount() { return discount; }
    public boolean isAvailable() { return isAvailable; }
    public double getWeight() { return weight; }
    public String getColor() { return color; }

    // 🔥 build method
    public Product build() {
        return new Product(this);
    }
}