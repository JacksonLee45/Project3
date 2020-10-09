import java.util.ArrayList;

public class SpringRollFactory {
    SpringRollFactory(){}

    ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<30;i++) {
            Roll roll=new SpringRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}