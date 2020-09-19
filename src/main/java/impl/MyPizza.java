package impl;

import api.IPizza;

public class MyPizza implements IPizza {

    private String name;
    private double price;

    public MyPizza() {
        setName("Margherita");
        setPrice(12.5);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
