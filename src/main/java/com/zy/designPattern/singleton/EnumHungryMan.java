package com.zy.designPattern.singleton;

/**
 * 单例模式四:
 * 枚举类实现单例模式
 *      可以防止反序列化,反射漏洞
 *      天然是单例模式
 *      线程安全
 *      不支持懒加载
 */
public enum EnumHungryMan {

    // 通过EnumHungryMan.INSTANCE即可调用
    INSTANCE;

    public void selfDefinedMethod(){
        System.out.println("这里可以自定义枚举类中单例的任意方法");
    }
}
