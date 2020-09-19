package impl;

import api.IOrder;
import api.IPizza;

public class MyOrder implements IOrder {

    IPizza pizza;

    public MyOrder(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie: Pizza "+pizza.getName()+" cena "+pizza.getPrice());
    }
}
