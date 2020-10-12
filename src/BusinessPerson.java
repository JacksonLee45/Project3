import java.util.Random;

public class BusinessPerson extends Customer {

    //purchases array keeps track of how much of each item a customer purchases
    int[] purchases = new int[]{0,0,0,0,0,0,0,0};

    public int[] buyRoll() {
        chooseRoll();
        return purchases;
    }

    public void chooseRoll() {
        String[] rolls = new String[]{"Spring", "Egg", "Pastry", "Sausage", "Jelly"};
        Random rand = new Random();
        int numSauces;
        int numFillings;
        int numToppings;
        String rollChosen;
        //business person always takes 2 of each of the 5 types of rolls.
        for (int i = 0; i < 5; i ++){
            rollChosen = rolls[i];
            purchases[i] = purchases[i]+2;
            numSauces = rand.nextInt(4);
            purchases[5] = purchases[5]+ numSauces;
            numFillings = rand.nextInt(2);
            purchases[6] = purchases[6]+ numFillings;
            numToppings = rand.nextInt(3);
            purchases[7] = purchases[7]+ numToppings;
            System.out.println("Business Customer wants " + rollChosen + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");
            numSauces = rand.nextInt(4);
            purchases[5] = purchases[5]+ numSauces;
            numFillings = rand.nextInt(2);
            purchases[6] = purchases[6]+ numFillings;
            numToppings = rand.nextInt(3);
            purchases[7] = purchases[7]+ numToppings;
            System.out.println("Business Customer wants " + rollChosen + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");

        }


    }
}
