package com.unittesting.example.unittesting.model;

public class Item {

    private final int id;
    private final String name;
    private final int price;
    private final int quantity;

    public Item(int id, String name, int price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString(){
        return String.format("Item[%d, %s, %d, %d]", id, name, price, quantity);
    }
}
