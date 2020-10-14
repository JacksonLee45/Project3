import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

public class MyUnitTest {

    @Test
    public void personResponseOutage(){
        Person testPerson = new Person();
        Store testStore = new Store(1);
        testStore.startDay();
        testPerson.Order.add(RollEnum.SAUSAGE);
        testPerson.Order.add(RollEnum.SAUSAGE);
        testStore.takeCustomer(testPerson);
        testStore.endDay();
        assertEquals(testPerson.getOrder(), new ArrayList<>());
    }

    @Test
    public void businessResponseOutage(){
        BusinessPerson testPerson = new BusinessPerson();
        Store testStore = new Store(1);
        testStore.startDay();
        testPerson.Order.add(RollEnum.SAUSAGE);
        testPerson.Order.add(RollEnum.SAUSAGE);
        testStore.takeCustomer(testPerson);
        testStore.endDay();
        assertEquals(testPerson.getOrder(), new ArrayList<>());
    }

    @Test
    public void cateringResponseOutage(){
        Catering testPerson = new Catering();
        Store testStore = new Store(1);
        testStore.startDay();
        testPerson.Order.add(RollEnum.SAUSAGE);
        testPerson.Order.add(RollEnum.SAUSAGE);
        testStore.takeCustomer(testPerson);
        testStore.endDay();
        assertEquals(testPerson.getOrder(), new ArrayList<>());
    }

    @Test
    public void emptyInventory(){
        Store testStore = new Store(0);
        Person testPerson = new Person();
        testStore.startDay();
        testStore.takeCustomer(testPerson);
        assertNotEquals(testPerson.getOrder(), new ArrayList<>());
        testStore.endDay();
    }

    @Test
    public void priceTest(){
        Store testStore = new Store(5);
        Person testPerson = new Person();
        testStore.startDay();
        testPerson.Order.clear();
        testPerson.Order.add(RollEnum.EGG);
        testStore.takeCustomer(testPerson);
        assert(testStore.totalSales > 3.12);
        testStore.endDay();
    }

    @Test
    public void emptyPriceTest(){
        Store testStore = new Store(0);
        Person testPerson = new Person();
        testStore.startDay();
        testStore.takeCustomer(testPerson);
        assert(testStore.totalSales == 0);
        testStore.endDay();
    }

    @Test
    public void noRolls() {
        Store testStore = new Store(0);
        testStore.startDay();
        assertNull(testStore.buyRoll(RollEnum.JELLY));
        testStore.endDay();
    }

    @Test
    public void numberRolls(){
        Store testStore = new Store(5);
        Person testPerson = new Person();
        testStore.startDay();
        testPerson.Order.clear();
        testPerson.Order.add(RollEnum.EGG);
        testStore.takeCustomer(testPerson);
        assertEquals(testStore.getNumRoll(RollEnum.EGG),4);
        testStore.endDay();
    }

    @Test
    public void numSales(){
        Store testStore = new Store(5);
        Person testPerson = new Person();
        testStore.startDay();
        testPerson.Order.clear();
        testPerson.Order.add(RollEnum.EGG);
        testStore.takeCustomer(testPerson);
        assertEquals(testStore.numSales, 1);
        testStore.endDay();
    }

    @Test
    public void numNoSales(){
        Store testStore = new Store(0);
        Person testPerson = new Person();
        testStore.startDay();
        testPerson.Order.clear();
        testPerson.Order.add(RollEnum.EGG);
        testStore.takeCustomer(testPerson);
        assertEquals(testStore.numSales, 0);
        testStore.endDay();
    }
}
