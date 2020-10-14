import java.util.ArrayList;

public class SausageRollFactory extends RollFactory {
    SausageRollFactory(){}

    protected ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<ToMake;i++) {
            Roll roll=new SausageRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}