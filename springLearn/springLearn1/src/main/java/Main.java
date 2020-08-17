
import model.Duck;
import model.DuckShop;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import scan.LoginController;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        //从容器中获取bean对象
//        Duck duck1_1 = (Duck) context.getBean("duck1");
//        Duck duck1_2 = (Duck) context.getBean("duck1");
//        System.out.println(duck1_1 == duck1_2);
//        Duck duck3_1 = (Duck) context.getBean("duck3");
//        Duck duck3_2 = (Duck) context.getBean("duck3");
//        System.out.println(duck3_1 == duck3_2);
//        DuckShop duckShop = (DuckShop) context.getBean("duckShop");
//        System.out.println(duckShop.toString());
//        Duck duck5 = (Duck) context.getBean("duck5");
//        System.out.println(duck5);
//        Duck duck6 = (Duck) context.getBean("duck6");
//        System.out.println(duck6);
//        Duck duck1_1 = (Duck) context.getBean("duck1");
//        System.out.println(duck1 == duck1_1);//true：duck1默认scope为单例
//        Duck duck2 = (Duck) context.getBean("duck2");
//        System.out.println(duck2);
//        Duck duck2_2 = (Duck) context.getBean("duck2");
//        System.out.println(duck2 == duck2_2);//false: duck2设置的scope为prototype，getBean生成新的对象
//        DuckShop shop = (DuckShop) context.getBean("duckShop");
//        System.out.println(shop);
//        Person p1 = (Person) context.getBean(Person.class);
//        System.out.println(p1);
//
//        Duck duck3 = (Duck) context.getBean("duck3");
//        System.out.println(duck3);
//
//        Duck duck4 = (Duck) context.getBean("duck4");
//        System.out.println(duck4);

        //通过类型在容器中获取bean：该类型只有一个对象在容器中，否则会报错
//        context.getBean(Duck.class);
//        LoginController loginController = (LoginController) context.getBean("loginController");
//        System.out.println(loginController.getDuck1());
//        System.out.println(loginController.getLoginService());
    }
}