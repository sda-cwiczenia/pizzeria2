package config;

import api.IOrder;
import api.IPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    IPizza myPizza() {
        return new MyPizza("Margherita", 22);
    }

    @Bean(name = "mojeZamowienie")
    IOrder myOrder(IPizza pizza) {
        return new MyOrder(pizza);
    }

}
