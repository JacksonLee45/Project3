import java.util.ArrayList;

public class JellyRollFactory extends RollFactory {
    JellyRollFactory(){}

    protected ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<ToMake;i++) {
            Roll roll=new JellyRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}
