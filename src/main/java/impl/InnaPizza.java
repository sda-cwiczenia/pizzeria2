package impl;

import api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component
@Qualifier("innaPizza")
@PropertySource("pizza.properties")
public class InnaPizza implements IPizza {
    @Value("Hawajska z pola")
    private String name;
    @Value("40")
    private double price;

//    public InnaPizza() {
//        setName("Hawajska");
//        setPrice(15.5);
//    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
@Value("${inna.name}")
    public void setName(String name) {
        this.name = name;
    }
@Value("${inna.price}")
    public void setPrice(double price) {
        this.price = price;
    }

}
