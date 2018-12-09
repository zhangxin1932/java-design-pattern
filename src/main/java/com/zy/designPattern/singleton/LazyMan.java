package com.zy.designPattern.singleton;

import com.zy.designPattern.factory.StaticFacotryLogger;
import org.slf4j.Logger;


/**
 * 单例模式:(即创建的只有一个实例,不会发生变化)
 * 	  懒汉模式
 * 		加上同步技术后,线程安全
 */
public class LazyMan {

    private static final Logger RUN_LOGGER = StaticFacotryLogger.getRunLogger();

    // 1.创建该类的private空参构造器
    private LazyMan(){

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
}
