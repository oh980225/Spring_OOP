package aop003;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("OK! Open the door!");
    }

    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("Lock the door~~");
    }
}
