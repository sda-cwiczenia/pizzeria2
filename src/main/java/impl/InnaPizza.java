package impl;

import api.IPizza;

public class InnaPizza implements IPizza {
    private String name;
    private double price;

    public InnaPizza() {
        setName("Hawajska");
        setPrice(15.5);
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
