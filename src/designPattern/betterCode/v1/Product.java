package designPattern.betterCode.v1;

public class Product {

    int id;
    String name;
    String description;
    double price;
    String category;
    String brand;
    int stock;
    double rating;
    double discount;
    boolean isAvailable;
    double weight;
    String color;

    // Constructor
    Product() {
    }

    public void setName(String name){
        this.name=name;

    }
    public void setDescription(String description){
   this.description = description;
    }
    public void setPrice(int price){
      this.price=price;
    }
    public void setId(int id){
        this.id = id;

    }
    public void setBrand(String brand){
        this.brand=brand;

    }
    public void setStock(int stock){
        this.stock=stock;

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

