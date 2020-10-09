import java.util.ArrayList;

public class EggRollFactory {
    EggRollFactory(){}

    ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<30;i++) {
            Roll roll=new EggRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}