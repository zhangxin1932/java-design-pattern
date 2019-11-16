package com.zy.designPattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public abstract class AbstractCglibProxy implements MethodInterceptor {
    @SuppressWarnings("unchecked")
    public <T> T getProxy(Class<T> tClass) {
        return (T) Enhancer.create(tClass, this);
    }
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        beforeInvoke();
        Object result = methodProxy.invokeSuper(object, args);
        afterInvoke();
        return result;
    }
    protected abstract void beforeInvoke();
    protected abstract void afterInvoke();
}
