package org.lanqiao.AOP;

import org.aspectj.lang.annotation.AfterReturning;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LogAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知："+"，目标对象："+objects+"，目标方法："+method.getName()+"，返回值："+o+"，方法参数个数"+o1 );
    }
}
