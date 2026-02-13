package lesson4_LiskovSubstituionPrinciple.problematicCode;

public abstract class CreditCard {

    private String ccNumber;

    private String ownerName;

    private int cvv;

    public void setCcNumber(String ccNumber){
        this.ccNumber=ccNumber;
    }
    public void setCvv(int cvv){
        this.cvv=cvv;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransaction();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();

    public  abstract void upiPayment();

    public abstract void intlPayment();

    public void displayCreditCardDetails(){
        System.out.println("CC number: "+ this.ccNumber+ ", with owner Name:"+this.ownerName);
    }
}
