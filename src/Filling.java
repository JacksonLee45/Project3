public class Filling {
    Roll roll;
    Filling(Roll roll) {
        this.roll=roll;
    }
    public double cost() {
        return 1.00+roll.cost();
    }
}
