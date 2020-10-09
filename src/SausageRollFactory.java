import java.util.ArrayList;

public class SausageRollFactory {
    SausageRollFactory(){}

    ArrayList<Roll> prepRolls() {
        ArrayList<Roll> rolls=new ArrayList<Roll>();
        for (int i=0;i<30;i++) {
            Roll roll=new SausageRoll();
            rolls.add(roll);
        }
        return rolls;
    }
}