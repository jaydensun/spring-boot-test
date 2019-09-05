package test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author sunyongjun
 * @since 2019/9/5
 */
@Aspect
@Component
public class TestObjectAspect {
    @Around("execution(* test.biz.ITestObject.test(..))")
    public Object test(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aspect before =======");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("aspect after =======");
        return proceed;
    }
}
