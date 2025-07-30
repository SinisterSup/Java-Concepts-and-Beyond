package streamslambdasLab;

public class Item {
    private int Id;
    private String Name;
    private double Price;
    private int quantity;

    public Item(int id, String name, double price,  int quantity) {
        this.Id = id;
        this.Name = name;
        this.Price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return this.Id;
    }
    public String getName() {
        return this.Name;
    }
    public double getPrice() {
        return this.Price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setId(int id) {
        this.Id = id;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public void setPrice(double price) {
        this.Price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
