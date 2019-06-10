package com.zy.designPattern.proxy.aop;

import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogAspectAdvice {

    @Around("@within(com.zy.designPattern.proxy.aop.LogAspect) || @annotation(com.zy.designPattern.proxy.aop.LogAspect)")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        // 获取参数
        Object[] args = point.getArgs();
        // 获取signature
        MethodSignature signature = (MethodSignature) point.getSignature();
        // 获取要代理的类的全限定名
        String className = signature.getDeclaringType().getName();
        // 获取要代理的方法的名称
        String methodName = signature.getName();
        // 获取方法入参的值
        String params = Joiner.on(",").useForNull("null").join(args);
        // 方法执行前打印日志
        //log.info(String.format("class: %s, method: %s, params-in: %s;", className, methodName, params));
        System.out.println((String.format("class: %s, method: %s, params-in: %s;", className, methodName, params)));
        // 执行方法
        Object result = point.proceed();
        // 方法执行后打印日志
        //log.info(String.format("class: %s, method: %s, params-out: %s;", className, methodName, result));
        System.out.println(String.format("class: %s, method: %s, params-out: %s;", className, methodName, result));
        return result;
    }

}
