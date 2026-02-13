package lesson4_ListOfSubstituionPrinciple.problematicCode;

public class VisaCard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay Implementaion of VISA");
    }

    @Override
    public void onlineTransaction() {
        System.out.println("online transaction Implementaion of VISA");


    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay Implementaion of VISA");


    }

    @Override
    public void mandatePayments() {
        System.out.println(" Mandate pay Implementaion of VISA");


    }
}
