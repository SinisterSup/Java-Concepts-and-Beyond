package generics.InventoryLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, "Book", 100.0, 10);
        Item item2 = new Item(2, "Pen", 20.0, 2);
        Item item3 = new Item(3, "Pencil", 5.0, 1);

        List<Item> itemList = new ArrayList<>(List.of(item1, item2, item3));
        Collections.sort(itemList);
        System.out.println(itemList);
    }
}
