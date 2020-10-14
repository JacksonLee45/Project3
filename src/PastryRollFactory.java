import java.util.ArrayList;

public class PastryRollFactory extends RollFactory {
    PastryRollFactory(){}

    protected ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<ToMake;i++) {
            Roll roll=new PastryRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}