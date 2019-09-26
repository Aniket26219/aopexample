package com.aopexample.aopexample.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAop {

    @AfterReturning(pointcut = "execution(* com.aopexample.aopexample.impl.MyImpl.getData(..))",
            returning = "retValue")
    public void getData(Object retValue){
        String str= (String) retValue;
        System.out.println("this is from aop = "+retValue);
    }
}
