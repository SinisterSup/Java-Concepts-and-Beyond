package generics.InventoryLab;

public class Item implements Comparable<Item>{
    private int id;
    private String name;
    private double price;
    // using double for money values
    // can lead to precision errors
    // hence, consider using BigDecimal for money values!!
    private int quantity;

    public Item(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Item() {
        this(0, "", 0.0, 0);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + '}';
    }

    // To make sure the orders can be compared based on their pricing
    // Ascending order
    @Override
    public int compareTo(Item otherItem) {
        return Double.compare(this.price, otherItem.price);
//        if (this.price < otherItem.price) return -1;
//        else if (this.price > otherItem.price) return 1;
//        else return 0;
    }
}
