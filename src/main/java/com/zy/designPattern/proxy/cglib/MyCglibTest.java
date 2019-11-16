package com.zy.designPattern.proxy.cglib;

public class MyCglibTest {
    public static void main(String[] args) {
        MyCglibProxy myCglibProxy = new MyCglibProxy();
        Coder coder = myCglibProxy.getProxy(Coder.class);
        coder.code("coding", "coding", "coding");
    }
}
