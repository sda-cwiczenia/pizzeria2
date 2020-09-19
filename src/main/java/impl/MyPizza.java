package impl;

import api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("pizza.properties")
public class MyPizza implements IPizza {

    private String name;
    private double price;

//    public MyPizza() {
//        setName("Margherita");
//        setPrice(12.5);
//    }

    public MyPizza(@Value("${moja.name}") String name, @Value("${moja.price}") double price) {
        this.name = name;
        this.price = price;
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
