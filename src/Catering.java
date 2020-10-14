import java.util.ArrayList;
import java.util.Random;

public class Catering extends Customer {
    boolean giveBack;
    public boolean isSatisfied(ArrayList<Roll> Basket) {
        for (Roll roll : Basket) {
            if (roll==null) return false;
        }
        return true;
    }

    Catering() {
        name="Catering Customer";
        Random rand = new Random();
        for (int i=0;i<3;i++) {
            RollEnum tempType=RollEnum.randomEnum(RollEnum.class);
            for (int j=0;j<5;j++) Order.add(tempType);
        }

    }
}
