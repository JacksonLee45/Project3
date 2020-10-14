import java.util.ArrayList;
import java.util.Random;

public class Catering extends Customer {
    boolean giveBack;
    ArrayList<Roll> tempBasket=new ArrayList<Roll>();
    public boolean isSatisfied(ArrayList<Roll> Basket) {
        Order.clear();
        for (Roll roll : Basket) {
            if (roll==null && Basket.size()<14) {
                Order.add(RollEnum.randomEnum(RollEnum.class));
            }
        }
        return true;
    }

    Catering() {
        name = "Catering Customer";
        Random rand = new Random();
        ArrayList<RollEnum> tempArray = new ArrayList<RollEnum>();
        while (tempArray.size()<3) {
            RollEnum tempType = RollEnum.randomEnum(RollEnum.class);
            if (!tempArray.contains(tempType)) tempArray.add(tempType);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) Order.add(tempArray.get(i));
        }
    }
}
