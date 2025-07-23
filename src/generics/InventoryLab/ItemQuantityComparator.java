package generics.InventoryLab;

import java.util.Comparator;

public class ItemQuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        return Integer.compare(item1.getQuantity(), item2.getQuantity());
//        if (item1.getQuantity() < item2.getQuantity()) return -1;
//        else if (item1.getQuantity() > item2.getQuantity()) return 1;
//        else return 0;
    }
}
