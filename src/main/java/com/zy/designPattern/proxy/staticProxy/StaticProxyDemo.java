package com.zy.designPattern.proxy.staticProxy;

import org.junit.Test;

/**
 *
 * 1.代理模式是常用设计模式的一种，我们在软件设计时常用的代理一般是指静态代理，也就是在代码中显式指定的代理。
 *
 * 2.静态代理由 业务实现类、业务代理类 两部分组成。
 * 业务实现类 负责实现主要的业务方法，
 * 业务代理类负责对调用的业务方法作拦截、过滤、预处理，主要是在方法中首先进行预处理动作，然后调用业务实现类的方法，还可以规定调用后的操作。
 * 我们在需要调用业务时，不是直接通过业务实现类来调用的，而是通过业务代理类的同名方法来调用被代理类处理过的业务方法。
 *
 * 3.静态代理的实现：
 * a：首先定义一个接口，说明业务逻辑。
 * b：然后，定义业务实现类，实现业务逻辑接口
 * c：定义业务代理类：
 *      通过组合，在代理类中创建一个业务实现类对象来调用具体的业务方法；
 *      通过实现业务逻辑接口，来统一业务方法；
 *      在代理类中实现业务逻辑接口中的方法时，进行预处理操作;
 *      通过业务实现类对象调用真正的业务方法、进行调用后操作的定义。
 * d：在使用时，首先创建业务实现类对象，然后把业务实现类对象作构造参数创建一个代理类对象，最后通过代理类对象进行业务方法的调用。
 *
 * 4.静态代理的缺点很明显：
 * 一个代理类只能对一个业务接口的实现类进行包装，如果有多个业务接口的话就要定义很多实现类和代理类才行。
 * 而且，如果代理类对业务方法的预处理、调用后操作都是一样的（比如：调用前输出提示、调用后自动关闭连接），则多个代理类就会有很多重复代码。
 * 这时我们可以定义这样一个代理类，它能代理所有实现类的方法调用：根据传进来的业务实现类和方法名进行具体调用。——那就是动态代理。
 *
 */


public class StaticProxyDemo {

    @Test
    public void fn() {
        // step4: 创建业务实现类对象
        CountImpl count = new CountImpl();
        CountProxy countProxy = new CountProxy(count);
        System.out.println(countProxy.query());
        System.out.println(">>>>>>>>>>>>>>... ");
        countProxy.update();
    }


    /**
     * step1: 定义一个账户接口
     */
    private interface Count {
        // 查询账户
        Long query();

        // 修改账户
        void update();
    }

    /**
     * step2: 定义业务实现类
     */
    private class CountImpl implements Count {

        @Override
        public Long query() {
            System.out.println("查看账户");
            return 100L;
        }

        @Override
        public void update() {
            System.out.println("修改账户");
        }
    }

    /**
     * step3: 定义业务代理类
     */
    private class CountProxy implements Count {
        //组合一个业务实现类对象来进行真正的业务方法的调用
        private CountImpl count;

        public CountProxy(CountImpl count) {
            this.count = count;
        }

        @Override
        public Long query() {
            System.out.println("查询账户的预处理——————");
            // 调用真正的查询账户方法
            Long query = count.query();
            System.out.println("查询账户之后————————");
            return query;
        }

        @Override
        public void update() {
            System.out.println("修改账户之前的预处理——————");
            // 调用真正的修改账户操作
            count.update();
            System.out.println("修改账户之后——————————");
        }
    }

}
