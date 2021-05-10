import java.io.*;
import java.util.*;

import org.junit.*;

import jdk.jfr.Timestamp;

import static org.junit.Assert.*;

public class VendingMachineTest {

    VendingMachine vm;
    @Before
    public void setUp() {
        vm = new VendingMachine();
    }

    @Test
    public void vmShouldTurnOnOffWhenSwitchedOnOff() {
        assertFalse(vm.isOn());

        vm.powerButton();

        assertTrue(vm.isOn());

        vm.powerButton();

        assertFalse(vm.isOn());
    }

    @Test
    public void vmCanAddItems() {
        add3Items();

        assertTrue(vm.numItems() == 3);

        ArrayList<String> secondAddition = new ArrayList<String>();
        secondAddition.add("chocolate");

        vm.addItems(secondAddition);

        assertTrue(vm.numItems() == 4);
    }

    @Test
    public void vmCanRemoveItems() throws IOException {

        add3Items();

        vm.removeItemAt(1);

        assertTrue(vm.numItems() == 2);
        assertFalse(vm.itemsInclude("granola bar"));
    }

    private void add3Items() {
        ArrayList<String> newItems = new ArrayList<String>();
        newItems.add("candy");
        newItems.add("granola bar");
        newItems.add("peanuts");

        vm.addItems(newItems);
    }
}