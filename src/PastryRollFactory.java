import java.util.ArrayList;

public class PastryRollFactory {
    PastryRollFactory(){}

    ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<30;i++) {
            Roll roll=new PastryRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}