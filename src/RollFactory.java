import java.util.ArrayList;
//roll factory generates arraylist of specific type of roll depending on factory type
public abstract class RollFactory {
    Integer ToMake;
    public ArrayList<Roll> orderRolls(Integer Total) {
    ArrayList<Roll> Rolls;
    ToMake=Total;
        return prepRolls();
    }
    protected abstract ArrayList<Roll> prepRolls();

}
