package org.lanqiao.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Logbefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("nmsl");
    }
}
