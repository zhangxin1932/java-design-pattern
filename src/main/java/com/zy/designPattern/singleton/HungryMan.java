package com.zy.designPattern.singleton;
/**
 *
 * 单例模式:(即创建的只有一个实例,不会发生变化)
 * 		饿汉模式
 * 			线程安全
 */
public class HungryMan {

    // 1.创建private空参构造
    private HungryMan(){
        if (INSTANCE != null){ // 防止反射方式漏洞,详见单元测试fn02
            throw new RuntimeException();
        }
    }

    // 2.创建私有的静态属性,该属性是该类的一个实例,并且已经初始化
    private static final HungryMan INSTANCE = new HungryMan();

    // 3.提供该静态属性的外部访问方式,只可读,不可修改
    public static HungryMan getInstance(){
        return INSTANCE;
    }
}
