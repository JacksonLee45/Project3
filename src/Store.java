//Class for the Store
            /*
            The store will maintain sales data, inventory levels, costs of
            orders, and special events for daily display and summary statistics.
             */

public class Store {

    int springRoll; //Attributes to hold the number of Rolls the Store has in inventory
    int eggRoll;
    int pastryRoll;
    int sausageRoll;
    int jellyRoll;

    final float srPrice = 1.25f;
    final float erPrice = 1.50f;
    final float prPrice = 1.75f;
    final float sasrPrice = 2.00f;
    final float jrPrice = 2.25f;


    public Store(int numSpringRoll, int numEggRoll, int numPastryRoll, int numSausageRoll, int numJellyRoll) {
        //Constructor for the Store
        springRoll = numSpringRoll;
        eggRoll = numEggRoll;
        pastryRoll = numPastryRoll;
        sausageRoll = numSausageRoll;
        jellyRoll = numJellyRoll;
    }

    public void sellRoll() {
        //edit the store's inventory
    }


}
