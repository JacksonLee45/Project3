import java.util.ArrayList;

public class EggRollFactory extends RollFactory {
    EggRollFactory(){}

    protected ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<ToMake;i++) {
            Roll roll=new EggRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}