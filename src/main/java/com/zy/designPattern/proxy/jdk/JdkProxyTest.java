package com.zy.designPattern.proxy.jdk;

public class JdkProxyTest {
    public static void main(String[] args) {
        Person programmer = new Programmer();
        JdkProxy<Person> jdkProxy = new JdkProxy<>(programmer);
        Person proxyProgrammer = jdkProxy.getProxy();
        proxyProgrammer.sleep();
    }
}
