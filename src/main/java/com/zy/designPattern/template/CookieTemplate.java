package com.zy.designPattern.template;

/**
 * 模板抽象类, 模板方法是抽象方法
 */
public abstract class CookieTemplate {

    protected abstract void firstStep();

    protected abstract void secondStep();

    protected abstract void thirdStep();

    public final void cook() {
        firstStep();
        secondStep();
        thirdStep();
    }
}
