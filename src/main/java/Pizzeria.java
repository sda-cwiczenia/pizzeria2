import api.IOrder;
import api.IPizza;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import config.Config;
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pizzeria {
    public static void main(String[] args) {

        // Podejście klasyczne
        // To jest konfiguracja programu
//        IPizza pizza = new InnaPizza();
//        IOrder order = new MyOrder(pizza);

        // Rozwiązanie na springu z konfiguracją xml
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("konfiguracja.xml");
//        MyOrder order = (MyOrder) context.getBean("myOrder");  // pierwszy sposób z klasą jako argument
//        MyOrder order2 = context.getBean("innyOrder",MyOrder.class); // drugi sposób z rzutowaniem na typ

        // Rozwiązanie na springu z klasą konfiguracyjną
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyOrder order = context.getBean("mojeZamowienie", MyOrder.class);

        System.out.println("Obiekt order : "+order);
        // Logika biznesowa
        //order.printOrder();

        MyOrder order2 = context.getBean("mojeZamowienie", MyOrder.class);
        System.out.println("Obiekt order2 : "+order);

    }
}
