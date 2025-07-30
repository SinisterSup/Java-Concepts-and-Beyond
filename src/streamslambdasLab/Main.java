package streamslambdasLab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(23, "book", 58, 12);
        Item item2 = new Item(13, "pen", 10, 76);
        Item item3 = new Item(404, "geometryBox", 120, 17);
        Item item4 = new Item(47, "KEYBOARD", 5984, 4);
        Item item5 = new Item(38, "MOUSE", 2137, 8);
        List<Item> itemsList = new ArrayList<>(List.of(item1, item2, item3,  item4, item5));

//        List<Integer> itemIds = itemsList.stream().map(item -> item.getId()).toList();
        List<Integer> itemIdList = listItemIds(itemsList);
        List<Double> itemPricesList = listItemPrices(itemsList);
        printLowercaseItems(itemsList);
        List<Integer> itemNameLengths = getNameLengths(itemsList);
        List<String> costlyItemNames = getCostlyItemNames(itemsList);
        System.out.println("itemIdList: " + itemIdList);
        System.out.println("itemPricesList: " + itemPricesList);
        System.out.println("itemNameLengths: " + itemNameLengths);
        System.out.println("costlyItemNames: " + costlyItemNames);
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
}
