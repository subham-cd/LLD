package lesson4_LiskovSubstituionPrinciple.BetterCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCard> cards = new ArrayList<>();
        for (InternationalPaymentCompatibleCard card: cards){
            card.internationalPayment();
        }
    }
}
///IS-A RELATION


//these all code violate the liskov substitution principle :(BARBARA LISKOV):
// its says subclassed should be substituable for their base classes without altering the correctness of the classes