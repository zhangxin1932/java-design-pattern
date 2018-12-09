package com.zy.designPattern.singleton;

import com.zy.designPattern.factory.StaticFacotryLogger;
import org.slf4j.Logger;

import java.io.ObjectStreamException;
import java.io.Serializable;


/**
 * 单例模式:(即创建的只有一个实例,不会发生变化)
 * 	  懒汉模式
 * 		加上同步技术后,线程安全
 */
public class LazyMan implements Serializable {

    private static final Logger RUN_LOGGER = StaticFacotryLogger.getRunLogger();

    // 1.创建该类的private空参构造器
    private LazyMan(){
        if (INSTANCE != null) {  // 防止反射方式漏洞,详见单元测试fn02
            throw new RuntimeException();
        }
    }

    // 2.创建一个静态的,私有的属性,该属性是该类的一个实例,但是没有初始化
    private static LazyMan INSTANCE;

    // 3.提供该属性的外部访问方式,注意多线程时的问题,需要同步技术
    public static LazyMan getInstance(){
        if (INSTANCE == null){
            synchronized (LazyMan.class){
                if (INSTANCE == null){
                    INSTANCE = new LazyMan();
                }
            }
        }
        return INSTANCE;
    }

    // 4.若此实例实现了Serializable接口,则需要防止反序列化问题
    private Object readResolve() throws ObjectStreamException {
        return INSTANCE;
    }
}
