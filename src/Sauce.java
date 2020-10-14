public class Sauce extends Extra {
    Roll roll;
    Sauce(Roll roll) {
        this.roll=roll;
    }
    public double cost() {
        return 1.00+roll.cost();
    }
    public String description() {
        return roll.description()+" with sauce";
    }
}
