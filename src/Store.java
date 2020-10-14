import java.util.ArrayList;
import java.util.Random;

public class Store implements Subject{

    private String updateText;

    private ArrayList<Roll> Inventory= new ArrayList<Roll>();

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
            //observer.update("The Store Currently Has: \n" + springRoll + " Spring Rolls\n" + eggRoll + " Egg Rolls\n" + sausageRoll + " Suasage Rolls\n" + jellyRoll + " Jelly Rolls\n" + "Sales = $"+ numSales);
        }
    }

    public void notifyObservers(String update) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(update);
        }
    }

    float numSales;
    int inScale;
    double totalSales;

    public void update(String update){
        System.out.println(update);
    }

    public Store(int scale) {
        //Constructor for the Store
        inScale=scale;

        numSales = 0.0f;
    }

    public void takeCustomer(Customer customer) {
        if (Inventory.isEmpty()) {notifyObservers("Customer left because the store was closed due to no inventory.");return;}
        ArrayList<Roll> basket = new ArrayList<Roll>();
        while (!customer.getOrder().isEmpty()) {

            ArrayList<RollEnum> tempList = customer.getOrder();
            for (RollEnum roll : tempList) {
                basket.add(buyRoll(roll));
                removeRoll(roll);
            }
            while (basket.remove(null)) ;
            if (!customer.isSatisfied(basket)) {
                Inventory.addAll(customer.Returns);
                //basket.clear();
            }
        }
        if (basket.isEmpty()) notifyObservers(customer.name+" didn't buy anything.");
        else {
            for (Roll roll : basket) {
                Random rand = new Random();
                int roll1 = rand.nextInt(3);
                for (int i = 0; i < roll1; i++) roll = sauceRoll(roll);
                roll1 = rand.nextInt(1);
                for (int i = 0; i < roll1; i++) roll = fillRoll(roll);
                roll1 = rand.nextInt(2);
                for (int i = 0; i < roll1; i++) roll = topRoll(roll);
                notifyObservers(customer.name + " bought a " + roll.description() + " for " + roll.cost());
                totalSales+=roll.cost();
            }
            numSales+=1;
        }
    }

    public Roll buyRoll(RollEnum Type)
    {
        for (Roll roll : Inventory) {
            if (roll.getType().equals(Type)) {
                return roll;
            }
        }
        notifyObservers("ran out of "+Type.label);
        //if we're here then we're out of a specific type of roll, notify
        return null;
    }

    public int getNumRoll(RollEnum Type)
    {
        int counter=0;
        for (Roll roll : Inventory) {
            if (roll.getType().equals(Type)) {
                counter++;
            }
        }
        return counter;
    }

    public Roll sauceRoll(Roll input)
    {
        Roll tempRoll = new Sauce(input);
        return tempRoll;
    }

    public Roll topRoll(Roll input)
    {
        Roll tempRoll = new Topping(input);
        return tempRoll;
    }

    public Roll fillRoll(Roll input)
    {
        Roll tempRoll = new Filling(input);
        return tempRoll;
    }

    public void printInventory() {
            notifyObservers();
    }

    public void endDay()
    {
        for (RollEnum rollType : RollEnum.values()) {
            notifyObservers(getNumRoll(rollType) + " " +rollType.label+" remaining.");
        }
        notifyObservers(numSales+" total daily sales for "+totalSales+" dollars");

    }

    private void removeRoll(RollEnum Type) {
        for (Roll roll : Inventory) {
            if (roll.Type==Type) {
                Inventory.remove(roll);
                break;
            }
        }
    }

    public void startDay()
    {
        totalSales=0;
        numSales=0;
        for (RollEnum rollType : RollEnum.values()) {
            if (getNumRoll(rollType)==0) {
                RollFactory factory;
                switch (rollType) {
                    case EGG:
                        factory = new EggRollFactory();
                        Inventory.addAll(factory.orderRolls(inScale));
                        break;
                    case JELLY:
                        factory = new JellyRollFactory();
                        Inventory.addAll(factory.orderRolls(inScale));
                        break;
                    case SAUSAGE:
                        factory = new SausageRollFactory();
                        Inventory.addAll(factory.orderRolls(inScale));
                        break;
                    case PASTRY:
                        factory = new PastryRollFactory();
                        Inventory.addAll(factory.orderRolls(inScale));
                        break;
                    case SPRING:
                        factory = new SpringRollFactory();
                        Inventory.addAll(factory.orderRolls(inScale));
                        break;
                    default:
                        break;
                }

                }

            }
        }
}


