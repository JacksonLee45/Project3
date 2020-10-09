import java.util.ArrayList;

public class JellyRollFactory {
    JellyRollFactory(){}

    ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<30;i++) {
            Roll roll=new JellyRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}
