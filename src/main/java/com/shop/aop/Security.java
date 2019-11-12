package com.shop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Security {

//    @Pointcut("execution(* com.shop.service.impl.CustomerServiceImpl.actionInStore(..))")
//    public void serviceBefore(){
//    }
//
//    @Before(value = "serviceBefore()")
//    public void getScold(JoinPoint joinPoint) {
//        System.err.println("Please show me your bill!");
//    }

    // profiler
    @Around("execution(* com.shop.service.impl.CustomerServiceImpl.actionInStore(..)) && args(val, ..)")
    public Object action(ProceedingJoinPoint joinPoint, String val) throws Throwable {
        long timeBefore = System.currentTimeMillis();
        Object object = joinPoint.proceed();

        long timeAfter = System.currentTimeMillis();

        System.err.println("Please show me your bill!");
        System.err.println("Checkness with customer for billing finished in " +
                ((timeAfter - timeBefore) / 1000) + "s");
        return object;
    }

}
