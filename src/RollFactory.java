import java.util.ArrayList;

public abstract class RollFactory {
    Integer ToMake;
    public ArrayList<Roll> orderRolls(Integer Total) {
    ArrayList<Roll> Rolls;
    ToMake=Total;
        return prepRolls();
    }
    protected abstract ArrayList<Roll> prepRolls();

}
