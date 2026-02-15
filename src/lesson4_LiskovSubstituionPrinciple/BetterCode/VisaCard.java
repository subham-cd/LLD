package lesson4_LiskovSubstituionPrinciple.BetterCode;

public class VisaCard extends CreditCard implements InternationalPaymentCompatibleCard {
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


    @Override
    public void internationalPayment() {
        System.out.println("International payment");
    }
}
