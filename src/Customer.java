import java.util.ArrayList;

abstract class Customer {
    //Class for all Customers
    ArrayList<RollEnum> Order=new ArrayList<RollEnum>();
    ArrayList<Roll> Returns=new ArrayList<Roll>();
    String name="";

    public ArrayList<RollEnum> getOrder() {
        return Order;
    }

    public abstract boolean isSatisfied(ArrayList<Roll> Basket);
        //Decides on how many rolls to buy (1-3 rolls of a single type)


}
