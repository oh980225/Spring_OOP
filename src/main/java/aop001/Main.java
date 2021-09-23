package aop001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config/aop001.xml");
        Person aMan = context.getBean("boy", Person.class);
        Person aWoman = context.getBean("girl", Person.class);

        aMan.runSomething();
        aWoman.runSomething();
    }
}
