public class Filling extends Extra {
    Roll roll;
    Filling(Roll roll) {
        this.roll=roll;
    }
    public double cost() {
        return 1.00+roll.cost();
    }
    public String description() {
        return roll.description()+" with filling";
    }
}
