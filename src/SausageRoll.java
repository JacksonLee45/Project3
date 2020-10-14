public class SausageRoll extends Roll {
    SausageRoll() {
        Type=RollEnum.SAUSAGE;
        Desc="Sausageroll";
    }
    public double cost() {
        return 2.50;
    }
    public String description() {return "Sausage roll";}

}