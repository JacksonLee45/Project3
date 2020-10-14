public class JellyRoll extends Roll {
    JellyRoll() {
        Type=RollEnum.JELLY;
        Desc="Jellyroll";
    }
    public double cost() {
        return 1.00;
    }
    public String description() {return "Jelly roll";}

}
