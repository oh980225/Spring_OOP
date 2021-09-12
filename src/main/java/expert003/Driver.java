package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/expert003.xml");
        Car aCar = context.getBean("car", Car.class);

        System.out.println(aCar.getTireBrand());
    }
}