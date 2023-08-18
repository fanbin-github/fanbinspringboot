package com.fb.springbootfbtest.util;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LogPrint {

    private static long startTime;

    /**
     * 定义切点
     */
    @Pointcut(value = "@annotation(TestAop)")
    public void pointcut() {
        System.out.println("pointcut签名");
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        log.info(joinPoint.getSignature().getName());
        log.info("前置通知被执行");
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        log.info("消耗的时间为： " + (System.currentTimeMillis() - startTime) + "毫秒");
        log.info("后置通知被执行");
    }


}
