import java.util.ArrayList;

public class BusinessPerson extends Customer {

    public boolean isSatisfied(ArrayList<Roll> Basket) {
        Order.clear();
        //if any are null then business person is not happy and will return basket
        for (Roll roll : Basket) {
            if (roll==null || Basket.size()<10) {
                Returns.addAll(Basket);
                Basket.clear();
                return false;
            }
        }
        return true;
    }

    BusinessPerson() {
        name="Business Person";
            for (RollEnum rollType : RollEnum.values()) {
                Order.add(rollType);
                Order.add(rollType);
            }

    }
}
