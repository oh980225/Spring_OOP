package expert002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/expert002/expert002.xml");
        Car aCar = context.getBean("car", Car.class);
        Tire aKoreanTire = context.getBean("tire", Tire.class);
        aCar.setTire(aKoreanTire);

        System.out.println(aCar.getTireBrand());
    }
}