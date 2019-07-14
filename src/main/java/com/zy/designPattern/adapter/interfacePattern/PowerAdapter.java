package com.zy.designPattern.adapter.interfacePattern;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * 接口型适配器:
 *  抽象类
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class PowerAdapter implements DCOutput {
    protected AC220 ac220;
    @Override
    public int output5V() {
        return ac220.output220V();
    }
    @Override
    public int output9V() {
        return ac220.output220V();
    }
    @Override
    public int output12V() {
        return ac220.output220V();
    }
    @Override
    public int output24V() {
        return ac220.output220V();
    }
}
