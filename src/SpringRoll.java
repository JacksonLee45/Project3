public class SpringRoll extends Roll {
    SpringRoll() {
        Type=RollEnum.SPRING;
        Desc="Springroll";
    }
    public double cost() {
        return 1.50;
    }
    public String description() { return "Spring roll";}
}