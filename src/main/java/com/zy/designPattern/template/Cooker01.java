package com.zy.designPattern.template;

/**
 * 基于模板的具体做饭方法
 */
public class Cooker01 extends CookieTemplate {
    @Override
    protected void firstStep() {
        System.out.println("买菜----->");
    }

    @Override
    protected void secondStep() {
        System.out.println("洗菜----->");
    }

    @Override
    protected void thirdStep() {
        System.out.println("做菜----->");
    }
}
