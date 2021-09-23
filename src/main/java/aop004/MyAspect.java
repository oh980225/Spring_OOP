package aop004;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* runSomething())")
    public void testAop() {
        // 여긴 어떤 것을 작성해도 의미X
    }

    @Before("testAop()")
    public void before(JoinPoint joinPoint) {
        System.out.println("OK! Open the door!");
    }

    @After("testAop()")
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("Lock the door~~");
    }
}
