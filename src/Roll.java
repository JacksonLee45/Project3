//roll object, this is what people want
public abstract class Roll {
    RollEnum Type;
    String Desc;
    Roll(){}

    public abstract double cost();
    public abstract String description();
    public RollEnum getType() {
        return Type;
    }

}
