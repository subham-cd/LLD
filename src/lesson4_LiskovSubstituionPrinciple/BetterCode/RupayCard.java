package lesson4_LiskovSubstituionPrinciple.BetterCode;

public class RupayCard extends CreditCard implements UpiCompatibleCreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay Implementaion of RupayCard");
    }

    @Override
    public void onlineTransaction() {
        System.out.println("online transaction Implementaion of RupayCard");


    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and pay Implementaion of RupayCard");


    }

    @Override
    public void mandatePayments() {
        System.out.println(" Mandate pay Implementaion of RupayCard");


    }


    @Override
    public void upiPayment() {

    }
}
