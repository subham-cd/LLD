package designPattern.betterCode.v1;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        p.setName("Iphone");
        p.setDescription(("This is an mobile"));
        p.setBrand("Apple");
        p.setPrice(100000);
        p.setStock(250);
        p.setId(1);
    }
}

//using getter/setter

//benifits:
//Readable
//managable
//extensible

//issue
//how to validate befire object creation
//what about immutable object

//just having setters will not work
//having too many angs in the cnstructor work

//what if we have all the args which are passed in constructor stored in data structures


//we can choose hashmap because here we have key-value pair

//but here problem is tha value should be fixed so we can write value as object cause in java er can box every thing into object
