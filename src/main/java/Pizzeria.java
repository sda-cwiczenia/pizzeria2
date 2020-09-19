import api.IOrder;
import api.IPizza;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pizzeria {
    public static void main(String[] args) {

        // Podejście klasyczne
        // To jest konfiguracja programu
//        IPizza pizza = new InnaPizza();
//        IOrder order = new MyOrder(pizza);

        // Rozwiązanie na springu

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
        MyOrder order = (MyOrder) context.getBean("myOrder");  // pierwszy sposób z klasą jako argument
        MyOrder order2 = context.getBean("innyOrder",MyOrder.class); // drugi sposób z rzutowaniem na typ

        // Logika biznesowa
        order2.printOrder();

    }
}
