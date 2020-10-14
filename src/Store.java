//Class for the Store
            /*
            The store will maintain sales data, inventory levels, costs of
            orders, and special events for daily display and summary statistics.
             */

public class Store implements Subject{

    private String updateText;

    private java.util.ArrayList observers = new java.util.ArrayList();

    public void registerObserver(Observer O) {
        observers.add(O);
    }

    public void removeObserver(Observer O) {
        observers.remove(O);
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update("The Store Currently Has: \n" + springRoll + " Spring Rolls\n" + eggRoll + " Egg Rolls\n" + sausageRoll + " Suasage Rolls\n" + jellyRoll + " Jelly Rolls\n" + "Sales = $"+ numSales); }
    }


    int springRoll; //Attributes to hold the number of Rolls the Store has in inventory
    int eggRoll;
    int pastryRoll;
    int sausageRoll;
    int jellyRoll;
    float numSales;

    final float srPrice = 1.25f;
    final float erPrice = 1.50f;
    final float prPrice = 1.75f;
    final float sasrPrice = 2.00f; //sausage roll price
    final float jrPrice = 2.25f;

    public void update(String update){
        System.out.println(update);
    }

    public Store(int numSpringRoll, int numEggRoll, int numPastryRoll, int numSausageRoll, int numJellyRoll) {
        //Constructor for the Store
        springRoll = numSpringRoll;
        eggRoll = numEggRoll;
        pastryRoll = numPastryRoll;
        sausageRoll = numSausageRoll;
        jellyRoll = numJellyRoll;
        numSales = 0.0f;
    }


    public void editInventory(int[] purchases){
        for(int i = 0; i < 8; i++) { //loops through each purchase
            if(i == 0) { //edit spring rolls
                springRoll -= purchases[i];
                numSales += srPrice;
            }
            if(i == 1){ //edit egg rolls
                eggRoll -= purchases[i];
                numSales += erPrice;
            }
            if(i == 2){
                pastryRoll -= purchases[i];
                numSales += prPrice;
            }
            if(i == 3){
                sausageRoll -= purchases[i];
                numSales += sasrPrice;
            }
            if(i == 4){
                jellyRoll -= purchases[i];
                numSales += jrPrice;
            }
            if(i == 5){ //handles sauce sales
                numSales += .25f * purchases[i];
            }
            if(i == 6){ //handles filling sales
                numSales += .25f * purchases[i];
            }
            if(i == 7){ //handles toppings
                numSales += .25f * purchases[i];
            }
        }
    }


    public void printInventory() {
            notifyObservers();
        /*
        System.out.println("Stores Current Inventory");
        System.out.println("Spring Rolls: " + springRoll);
        System.out.println("Egg Rolls: " + eggRoll);
        System.out.println("Pastry Rolls: " + pastryRoll);
        System.out.println("Sausage Rolls: " + sausageRoll);
        System.out.println("Total Sales: $" + numSales);
        */

    }



}
