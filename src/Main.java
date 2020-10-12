import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

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



            //Customers return an array with the quantities of their purchases in this form:
            //[spring rolls, egg rolls, pastry rolls, sausage rolls, jelly rolls, sauces, fillings, toppings]
            //meaning a returned array that looks like :
            //[0,1,0,2,0,1,3,0]
            //says that the customer got 1 egg roll, 2 sausage rolls, 1 sauce and 3 fillings
            //This is for ease of calculating costs

            Person testCustomer = new Person();
            int[] numBoughtCustomer = testCustomer.buyRoll();
            System.out.println(Arrays.toString(numBoughtCustomer));

            BusinessPerson testBusiness = new BusinessPerson();
            int[] numBoughtBusiness = testBusiness.buyRoll();
            System.out.println(Arrays.toString(numBoughtBusiness));

            Catering testCatering = new Catering();
            int[] numBoughtCatering = testCatering.buyRoll();
            System.out.println(Arrays.toString(numBoughtCatering));

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
