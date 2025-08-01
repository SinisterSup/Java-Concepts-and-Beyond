package streamslambdasLab;

import exceptions.DuplicateItemException;
import exceptions.InvalidQuantityException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(23, "book", 58, 12);
        Item item2 = new Item(13, "pen", 10, 76);
        Item item3 = new Item(404, "geometryBox", 120, 17);
        Item item4 = new Item(47, "KEYBOARD", 5989, 4);
        Item item5 = new Item(38, "MOUSE", 2149, 8);
        Item item6 = new Item(38, "MOUSE", 1399, 4);
        Item item7 = new Item(41, "Phone", 31999, 0);
        Item item8 = new Item(53, "Laptop", 53999, -2);
        List<Item> itemsList = new ArrayList<>(List.of(item1, item2, item3,  item4, item5,  item6, item7, item8));

//        List<Integer> itemIds = itemsList.stream().map(item -> item.getId()).toList();
        List<Integer> itemIdList = listItemIds(itemsList);
        List<Double> itemPricesList = listItemPrices(itemsList);
        printLowercaseItems(itemsList);
        List<Integer> itemNameLengths = getNameLengths(itemsList);
        List<String> costlyItemNames = getCostlyItemNames(itemsList);
        List<String> topItems = processTopItems(itemsList);
        Item firstInStockItem = getFirstInStockItem(itemsList);
        boolean isAnyItemOutOfStock = findIfAnyOutOfStock(itemsList);
        boolean areAllItemsInStock = AllItemsInStock(itemsList);
        boolean areAllItemsCheap = areItemsCheap(itemsList);

        System.out.println("itemIdList: " + itemIdList);
        System.out.println("itemPricesList: " + itemPricesList);
        System.out.println("itemNameLengths: " + itemNameLengths);
        System.out.println("costlyItemNames: " + costlyItemNames);
        System.out.println("topItems: " + topItems);
        System.out.println("isAnyItemOutOfStock: " + isAnyItemOutOfStock);
        System.out.println("areAllItemsInStock: " + areAllItemsInStock);
        System.out.println("areAllItemsCheap: " + areAllItemsCheap);
    }

    public static List<Integer> listItemIds(List<Item> items) {
        items.stream().map(Item::getId).forEach(System.out::println);
        List<Integer> itemIds = items.stream().map(Item::getId).toList();
        return itemIds;
    }
    public static List<Double> listItemPrices(List<Item> items) {
        items.stream()
                .map(Item::getPrice)
                .forEach(System.out::println);
        List<Double> itemPrices = items.stream()
                .map(Item::getPrice)
                .toList();
        return itemPrices;
    }
    public static void printLowercaseItems(List<Item> items) {
        items.stream()
                .filter(item -> {
                    String itemName = item.getName();
                    if (itemName == null || itemName.length() == 0) { return false; }
                    return itemName.equals(itemName.toLowerCase());
                })
                .forEach(System.out::println);
    }
    public static List<Integer> getNameLengths(List<Item> items) {
        items.stream().map(Item::getName).forEach(System.out::println);
        List<Integer> nameLengths = items.stream()
                        .map(item -> item.getName().length())
                        .toList();
        return nameLengths;
    }
    public static List<String> getCostlyItemNames(List<Item> items) {
        items.stream()
                .filter(item -> item.getPrice() > 1000)
                .map(Item::getName)
                .forEach(System.out::println);
        List<String> costlyItems = items.stream()
                .filter(item -> item.getPrice() > 1000)
                .map(Item::getName)
                .toList();
        return costlyItems;
    }

    public static List<String> processTopItems(List<Item> items) {
        List<String> topItems = items.stream()
                .filter(item -> item.getPrice() > 1000 && item.getQuantity() > 0)
                .map(Item::getName)
                .distinct()
                .sorted()
                .limit(5)
                .toList();
        return topItems;
    }

//    public static Optional<Item> getFirstInStockItem(List<Item> items) {
//        return items.stream()
//                .filter(item -> item.getQuantity() > 0)
//                .findFirst();  // Return null if no items are in-stock
//    }
    public static Item getFirstInStockItem(List<Item> items) {
        return items.stream()
                .filter(item -> item.getQuantity() > 0)
                .findFirst()
                .orElse(null);  // Return null if no items are in-stock
    }
    public static boolean findIfAnyOutOfStock(List<Item> items) {
        return items.stream()
                .anyMatch(item -> item.getQuantity() == 0);
    }
    public static boolean AllItemsInStock(List<Item> items) {
        return items.stream()
                .allMatch(item -> item.getQuantity() > 0);
    }
    public static boolean areItemsCheap(List<Item> items) {
        return items.stream()
                .noneMatch(item -> item.getPrice() > 5);
    }
}
