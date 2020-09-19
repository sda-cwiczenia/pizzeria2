package impl;

import api.IOrder;
import api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mojeZamowienie")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyOrder implements IOrder {

    IPizza pizza;

//    public MyOrder(@Qualifier("innaPizza") IPizza pizza) {
//        this.pizza = pizza;
//    }
@Autowired
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamówienie: Pizza "+pizza.getName()+" cena "+pizza.getPrice());
    }
}
