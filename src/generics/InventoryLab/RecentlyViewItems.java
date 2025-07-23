package generics.InventoryLab;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RecentlyViewItems {
    private final int MAX_ITEMS;
    private final LinkedList<Item> items;

    public RecentlyViewItems(int limit) {
        this.MAX_ITEMS = limit;
        this.items = new LinkedList<>();
    }
    public void addRecentlyViewedItem(Item item) {
//        if (items.contains(item)) {
//            items.remove(item);
//        }
        items.remove(item);
        items.addFirst(item);

        if (items.size() > MAX_ITEMS) {
            items.removeLast();
        }
    }
    public List<Item> getRecentlyViewedItems() {
        return new ArrayList<>(items);
    }
}
