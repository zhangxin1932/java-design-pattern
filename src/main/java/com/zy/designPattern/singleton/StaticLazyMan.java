package com.zy.designPattern.singleton;

/**
 * 单例模式三:
 *  静态内部类实现懒加载
 *      具有并发高效调用和延迟加载(调用时,才加载静态内部类)的能力
 *      线程安全
 */
public class StaticLazyMan {

    // 1.创建该类的private空参构造器
    private StaticLazyMan() { // 防止反射方式漏洞,详见单元测试fn02
        if (StaticLazyManInstance.INSTANCE != null) {
            throw new RuntimeException();
        }
    }

    // 2.创建静态内部类,在静态内部类中创建外部类的实例
    private static class StaticLazyManInstance {
        private static final StaticLazyMan INSTANCE = new StaticLazyMan();
    }

    // 3.通过静态内部类返回外部类的公共调用方法
    public static StaticLazyMan getInstance(){
        return StaticLazyManInstance.INSTANCE;
    }
}
