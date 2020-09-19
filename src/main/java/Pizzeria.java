import api.IOrder;
import api.IPizza;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;

public class Pizzeria {
    public static void main(String[] args) {

        // Podejście klasyczne
        // To jest konfiguracja programu
        IPizza pizza = new InnaPizza();
        IOrder order = new MyOrder(pizza);

        // Logika biznesowa
        order.printOrder();

    }
}
