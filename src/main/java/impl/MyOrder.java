package impl;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("mojeZamowienie")
public class MyOrder implements IOrder {

    IPizza pizza;

    public MyOrder(@Qualifier("innaPizza") IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie: Pizza "+pizza.getName()+" cena "+pizza.getPrice());
    }
}
