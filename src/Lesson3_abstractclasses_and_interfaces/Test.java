package Lesson3_abstractclasses_and_interfaces;



//class A{
//
//}
//class B{
//
//}
////class C extends A,B{///doesnt support
////
////}
//public class Test {
//}
//
////default method

interface  A{
    default void doSome(){
        System.out.println("A");
    }
}
interface  B{
    default void doSome(){
        System.out.println("B");

    }
}
class C implements A,B{
    @Override
    public void doSome(){
        B.super.doSome();

    }
}
public class Test {
    public static void main(String[] args) {
        
    }
}
//}