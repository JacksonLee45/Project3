public class PastryRoll extends Roll {
    PastryRoll() {
        Type=RollEnum.PASTRY;
    }
    public double cost() {
        return .99;
    }
    public String description() {return "Pastry roll";}

}