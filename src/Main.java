import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Store ourStore = new Store(30,30,30,30, 30); //Constructs the Store starts it with 30 rolls each


        Scanner myScanner = new Scanner(System.in); //Creates the scanner object to read in the number of days to simulate the store
        System.out.println("How many days shall the Store run for?");
        int days = myScanner.nextInt();

        for(int i = 1; i <= days; i++) {  //Simulates Each Day

            Roll roll=new JellyRoll();
            roll=new Sauce(roll);
            System.out.println(roll.cost());

            Person testCustomer = new Person();
            testCustomer.buyRoll();
        }

    }

}
        /*
        Further, you should select and use at least three distinct OO patterns
            that we have discussed in your design.  Typical uses might include
            factory (for instantiating rolls or customers), decorator (for adding
             extras), observer (for capturing events that will go to output).

             Im thinking we use factory only for customers.
         */
