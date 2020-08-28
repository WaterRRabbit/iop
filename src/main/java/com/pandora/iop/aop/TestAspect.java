package com.pandora.iop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author YHG
 * @date 2020/8/27 15:29
 */
@Aspect
@Component
public class TestAspect {

    @Before("execution(* com.pandora.iop.bean.ActorBean.*(..))")
    public void before(JoinPoint point) {
        System.out.println("123");
    }

}
