import java.util.ArrayList;

public abstract class RollFactory {
    public ArrayList<Roll> orderRolls(RollEnum Type) {
    ArrayList<Roll> Rolls;
        return prepRolls();
    }
    protected abstract ArrayList<Roll> prepRolls();

}
