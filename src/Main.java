import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Store ourStore = new Store(30); //Constructs the Store starts it with 30 rolls each

        StoreAnnouncer Announcer = new StoreAnnouncer();
        ourStore.registerObserver(Announcer);


        Scanner myScanner = new Scanner(System.in); //Creates the scanner object to read in the number of days to simulate the store
        System.out.println("How many days shall the Store run for?");
        int days = myScanner.nextInt();

        for(int i = 1; i <= days; i++) {  //Simulates Each Day

            System.out.println("Day: " + i);



            Customer testBusiness = new BusinessPerson();
            ourStore.takeCustomer(testBusiness);

            //Customer testPerson = new Person();
            //ourStore.takeCustomer(testPerson);



            //Customers return an array with the quantities of their purchases in this form:
            //[spring rolls, egg rolls, pastry rolls, sausage rolls, jelly rolls, sauces, fillings, toppings]
            //meaning a returned array that looks like :
            //[0,1,0,2,0,1,3,0]
            //says that the customer got 1 egg roll, 2 sausage rolls, 1 sauce and 3 fillings
            //This is for ease of calculating costs
            /*
            Person testCustomer = new Person();
            int[] numBoughtCustomer = testCustomer.buyRoll();
            System.out.println(Arrays.toString(numBoughtCustomer));
            ourStore.editInventory(numBoughtCustomer);

            BusinessPerson testBusiness = new BusinessPerson();
            int[] numBoughtBusiness = testBusiness.buyRoll();
            System.out.println(Arrays.toString(numBoughtBusiness));
            ourStore.editInventory(numBoughtBusiness);

            Catering testCatering = new Catering();
            int[] numBoughtCatering = testCatering.buyRoll();
            System.out.println(Arrays.toString(numBoughtCatering));
            ourStore.editInventory(numBoughtCatering);

            ourStore.printInventory();
            */

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
