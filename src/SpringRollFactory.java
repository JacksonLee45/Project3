import java.util.ArrayList;

public class SpringRollFactory extends RollFactory {
    SpringRollFactory(){}

    protected ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<ToMake;i++) {
            Roll roll=new SpringRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}