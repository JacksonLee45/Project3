public class EggRoll extends Roll {
    EggRoll() {
        Type=RollEnum.EGG;
        Desc="Eggroll";
    }
    public double cost() {
        return 3.12;
    }
    public String description() {return "Egg roll";}
}