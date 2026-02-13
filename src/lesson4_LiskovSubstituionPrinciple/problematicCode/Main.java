package lesson4_LiskovSubstituionPrinciple.problematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards= new ArrayList<>();
        for(CreditCard card:cards){
            if (card instanceof RupayCard){
                card.upiPayment();
            }
        }
    }
}
///IS-A RELATION


//these all code violate the liskov substitution principle :(BARBARA LISKOV):
// its says subclassed should be substituable for their base classes without altering the correctness of the classes