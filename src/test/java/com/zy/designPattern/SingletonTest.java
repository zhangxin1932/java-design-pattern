package com.zy.designPattern;

import com.zy.designPattern.builer.beanBuilder.BeanBuilder;
import com.zy.designPattern.singleton.EnumHungryMan;
import com.zy.designPattern.singleton.LazyMan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.time.Duration;
import java.time.Instant;

public class SingletonTest {


    @Test
    public void fn01(){
        System.out.println(LazyMan.getInstance() == LazyMan.getInstance());
        System.out.println(EnumHungryMan.INSTANCE == EnumHungryMan.INSTANCE);
        EnumHungryMan.INSTANCE.selfDefinedMethod();
    }

    // 除枚举方式创建的单例外,其他均可以通过反射或反序列化来发现其漏洞
    @Test
    public void fn02() throws Exception {
        LazyMan.getInstance();  // 这里要先调用
        Class<LazyMan> clazz = (Class<LazyMan>) Class.forName("com.zy.designPattern.singleton.LazyMan");
        Constructor<LazyMan> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        LazyMan l1 = constructor.newInstance();
        LazyMan l2 = constructor.newInstance();
        System.out.println(l1);
        System.out.println(l2);
    }

    @Test
    public void fn03(){
        Instant begin = Instant.now();
        System.out.println("<<<<<<<<<<<>>>>>>>>>>>>");
        Instant end = Instant.now();
        Duration duration = Duration.between(begin, end);
        long l = duration.toMillis();
        System.out.println(l);
    }

    public static void main(String[] args) {
        BeanBuilder builder = new BeanBuilder()
                .id(1)
                .name("tom")
                .score(90.5)
                .build();
        System.out.println(builder);
    }


}
