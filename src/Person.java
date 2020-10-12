import java.util.Random;

public class Person extends Customer {
    //Person is the Casual shopper

    //purchases array keeps track of how much of each item a customer purchases
    int[] purchases = new int[]{0,0,0,0,0,0,0,0};

    public int[] buyRoll() {
        Random random = new Random();
        int numRolls = random.nextInt(3 ) + 1;
        //Customer picks between 1 and 3 rolls
        for(int i = 0; i < numRolls; i++){
            chooseRoll();
        }
        return purchases;
    }

    public void chooseRoll() {
        String[] rolls = new String[]{"Spring", "Egg", "Pastry", "Sausage", "Jelly"};
        Random rand = new Random();
        int roll = rand.nextInt(5);
        //pick one random roll. Randomize numbers of sauces, fillings, and topppings.
        String rollChosen = rolls[roll];
        purchases[roll] = purchases[roll] + 1;
        int numSauces = rand.nextInt(4);
        purchases[5] = purchases[5]+ numSauces;
        int numFillings = rand.nextInt(2);
        purchases[6] = purchases[6]+ numFillings;
        int numToppings = rand.nextInt(3);
        purchases[7] = purchases[7]+ numToppings;
        System.out.println("Regular Customer wants " + rollChosen + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");
    }
}
