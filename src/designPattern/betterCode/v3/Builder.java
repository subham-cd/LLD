package designPattern.betterCode.v3;

public class Builder {

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
    Builder() {
    }
    public String getName(){
      return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getDescription(){
    return this.description;
    }
    //....
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
