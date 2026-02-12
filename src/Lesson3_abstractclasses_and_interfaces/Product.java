package Lesson3_abstractclasses_and_interfaces;

public abstract class Product {

    //abstarct method
    public  abstract double calculateDiscount();

    //concret method

    public  void  termsAndCondition(){
        System.out.println("Some terms");
    }
}
