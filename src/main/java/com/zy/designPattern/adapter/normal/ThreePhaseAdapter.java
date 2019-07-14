package com.zy.designPattern.adapter.normal;

import lombok.AllArgsConstructor;
/**
 * 适配器
 */
@AllArgsConstructor
public class ThreePhaseAdapter implements ThreePhaseSocket {
    //定义一个二相插座的引用对象
    private TwoPhaseSocket twoPhaseSocket;
    @Override
    public void input() {
        // 通过二相插座引用对象调用其具体方法，实现二相插座通电
        twoPhaseSocket.input();
    }
}
