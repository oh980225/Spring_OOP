package aop001;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
    @Before("execution(* runSomething ())")
    public void before(JoinPoint joinPoint) {
        System.out.println("OK! Open the door!");
    }
}
