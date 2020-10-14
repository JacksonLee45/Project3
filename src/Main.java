import java.util.*;

public class Main {

    public static void main(String[] args) {

        Store ourStore = new Store(30); //Constructs the Store starts it with 30 rolls each

        StoreAnnouncer Announcer = new StoreAnnouncer();
        ourStore.registerObserver(Announcer);


        Scanner myScanner = new Scanner(System.in); //Creates the scanner object to read in the number of days to simulate the store
        System.out.println("How many days shall the Store run for?");
        int days = myScanner.nextInt();

        for(int j = 1; j <= days; j++) {  //Simulates Each Day
            ourStore.startDay();
            ArrayList<Customer> customerList=new ArrayList<Customer>();
            Random rand = new Random();
            int roll = rand.nextInt(12) ;
            for (int i=0;i<roll;i++) {
                Customer temp=new Person();
                customerList.add(temp);
            }
            roll = rand.nextInt(3) ;
            for (int i=0;i<roll;i++) {
                Customer temp=new BusinessPerson();
                customerList.add(temp);
            }
            roll = rand.nextInt(3) ;
            for (int i=0;i<roll;i++) {
                Customer temp=new Catering();
                customerList.add(temp);
            }
            Collections.shuffle(customerList);

            for (Customer customer : customerList) {
                ourStore.takeCustomer(customer);
            }

            ourStore.endDay();

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
