import java.util.*;

public class VendingMachine {
    boolean on;
    ArrayList<String> items;

    public VendingMachine() {
        items = new ArrayList<String>();
    }

    public void powerButton() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int numItems() {
        return items.size();
    }

    public void addItems(ArrayList<String> itemsToAdd) {
        items.addAll(itemsToAdd);
    }

    public void removeItemAt(int i) {
        items.remove(i);
    }

    public boolean itemsInclude(String item) {
        return items.contains(item);
    }

}
