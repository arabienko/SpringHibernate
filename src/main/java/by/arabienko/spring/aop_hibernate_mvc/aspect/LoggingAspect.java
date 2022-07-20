package by.arabienko.spring.aop_hibernate_mvc.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* by.arabienko.spring.aop_hibernate_mvc.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(
            ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        String methodName = signature.getName();
        System.out.println("Begin of "+methodName);
        Object targetMethodResult = point.proceed();
        System.out.println("End of "+methodName);
        return targetMethodResult;
    }
}
