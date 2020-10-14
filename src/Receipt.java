import java.util.ArrayList;
import java.util.Arrays;

public class Receipt {
    String customer="";
    ArrayList<Roll> sales=new ArrayList<Roll>();
    double totalAmount;
    boolean impacted=false;
    ArrayList<String> customerType = new ArrayList<String>(Arrays.asList("Catering Customer", "Business Person", "Casual Person"));

    public boolean getImpacted() {
        return impacted;
    }

    public double getTotalAmount() {
        for (Roll roll : sales) totalAmount+=roll.cost();
        return totalAmount;
    }
}
