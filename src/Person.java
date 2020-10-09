import java.util.Random;

public class Person extends Customer {
    //Person is the Casual shopper

    public void buyRoll() {
        Random random = new Random();
        int numRolls = random.nextInt(3 ) + 1;
        for(int i = 0; i < numRolls; i++){
            chooseRoll();
        }
    }

    public void chooseRoll() {
        String[] rolls = new String[]{"Spring", "Egg", "Pastry", "Sausage", "Jelly"};
        Random rand = new Random();
        int roll = rand.nextInt(5) ;
        String rollChosen = rolls[roll];
        int numSauces = rand.nextInt(4);
        int numFillings = rand.nextInt(2);
        int numToppings = rand.nextInt(3);
        System.out.println("Customer wants " + rollChosen + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + "toppings");
    }
}
