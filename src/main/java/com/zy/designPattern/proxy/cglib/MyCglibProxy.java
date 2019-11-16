package com.zy.designPattern.proxy.cglib;

public class MyCglibProxy extends AbstractCglibProxy {
    @Override
    protected void beforeInvoke() {
        System.out.println("before cglib invoke ----- ");
    }
    @Override
    protected void afterInvoke() {
        System.out.println("after cglib invoke ----- ");
    }
}
