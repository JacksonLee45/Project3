import java.util.Random;

public class Catering extends Customer {

    String[] rolls = new String[]{"Spring", "Egg", "Pastry", "Sausage", "Jelly"};
    //purchases array keeps track of how much of each item a customer purchases
    int[] purchases = new int[]{0,0,0,0,0,0,0,0};

    public int[] buyRoll() {
        chooseRoll();
        return purchases;
    }

    public void chooseRoll() {
        //caterer picks 3 types of rolls.
        Random rand = new Random();
        int roll1 = rand.nextInt(5) ;
        int roll2 = roll1;
        //caterer will not pick 2 of the same roll, this is to ensure that
        while (roll2 == roll1){
            roll2 = rand.nextInt(5);
        }
        int roll3 = roll2;
        while(roll3 == roll2 | roll3 == roll2){
            roll3 = rand.nextInt(5);
        }
        purchases[roll1] = purchases[roll1] + 5;
        purchases[roll2] = purchases[roll2] + 5;
        purchases[roll3] = purchases[roll3] + 5;

        String rollChosen1 = rolls[roll1];
        String rollChosen2 = rolls[roll2];
        String rollChosen3 = rolls[roll3];
        //caterer purchases 5 of each of the 3 types selected
        for(int i = 0; i < 5; i++){
            int numSauces = rand.nextInt(4);
            purchases[5] = purchases[5]+ numSauces;
            int numFillings = rand.nextInt(2);
            purchases[6] = purchases[6]+ numFillings;
            int numToppings = rand.nextInt(3);
            purchases[7] = purchases[7]+ numToppings;
            System.out.println("Catering Customer wants " + rollChosen1 + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");

        }
        for(int i = 0; i < 5; i++){
            int numSauces = rand.nextInt(4);
            purchases[5] = purchases[5]+ numSauces;
            int numFillings = rand.nextInt(2);
            purchases[6] = purchases[6]+ numFillings;
            int numToppings = rand.nextInt(3);
            purchases[7] = purchases[7]+ numToppings;
            System.out.println("Catering Customer wants " + rollChosen2 + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");

        }
        for(int i = 0; i < 5; i++){
            int numSauces = rand.nextInt(4);
            purchases[5] = purchases[5]+ numSauces;
            int numFillings = rand.nextInt(2);
            purchases[6] = purchases[6]+ numFillings;
            int numToppings = rand.nextInt(3);
            purchases[7] = purchases[7]+ numToppings;
            System.out.println("Catering Customer wants " + rollChosen3 + " roll with " + numSauces + " sauces, " + numFillings + " fillings, and " + numToppings + " toppings");

        }
    }
}
