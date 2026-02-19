package designPattern.ProblematicCode.productClass;

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
    Product(int id, String name, String description, double price,
            String category, String brand, int stock, double rating,
            double discount, boolean isAvailable, double weight, String color) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.brand = brand;
        this.stock = stock;
        this.rating = rating;
        this.discount = discount;
        this.isAvailable = isAvailable;
        this.weight = weight;
        this.color = color;
    }

    //real world project can posses lot of attribute ...so problem here to managing this attribute become slighlty hard
     //situtation where too many attribute become problematic

     //let say we want to create an object and let say we want to validate the property before object creation


     //problem 1: we have to remember the order of argument making it hard to maintain
     //problem2 : what if we want to have optional args..we have to force to maunally give some default value


     //benefts:
     //easy to do validations

     //the problem of forcefully passing args can be solved by constructor overlaoding

     //cause contsructor explosion:it is not feasible to write so many constructor like if have 4 attributes we can have 2 raise to power 4 constructor it causes constructor explosion

    // Method to display product details
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

