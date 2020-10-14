import java.util.ArrayList;
import java.util.Random;

public class Person extends Customer {
    //Person is the Casual shopper
    boolean tryAgain=true;
    public boolean isSatisfied(ArrayList<Roll> Basket) {
        Order.clear();
        if (tryAgain) {Order.add(RollEnum.randomEnum(RollEnum.class));tryAgain=false;}

    return true;
    }

    Person() {
        name="Casual Person";
        Random rand = new Random();
        int roll1 = rand.nextInt(2)+1 ;
        for (int i=0;i<roll1;i++) {
            Order.add(RollEnum.randomEnum(RollEnum.class));
        }

    }

}
