package generics.InventoryLab;

import java.util.*;

public class Inventory<I extends Item> {
    private Map<Integer, I> itemsMap;
    public Inventory() {
        itemsMap = new HashMap<>();
    }
    public Map<Integer, I> getItems() {
        return itemsMap;
    }
    public void setItems(Map<Integer, I> items) {
        this.itemsMap = items;
    }
    public void addItem(I item) {
        if (itemsMap.containsKey(item.getId())) {
            throw new IllegalArgumentException("Item already exists in the inventory");
        }
        itemsMap.put(item.getId(), item);
    }
    public void removeItem(int id) {
        itemsMap.remove(id);
    }
    public void removeItem(I item) {
        itemsMap.remove(item.getId());
    }
    public I getItem(int id) {
        return itemsMap.get(id);
    }
    public int getSize() {
        return itemsMap.size();
    }
    public List<I> getAllItems() {
        return new ArrayList<>(itemsMap.values());
    }
}
