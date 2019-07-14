package com.zy.designPattern.adapter.normal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
/**
 * 冰箱:
 * 需要使用三相插座
 */
@AllArgsConstructor
@NoArgsConstructor
public class Refrigerator implements ThreePhaseSocket {
    private String name;
    @Override
    public void input() {
        cold();
    }
    public void cold() {
        System.out.println("开始冷冻衣服");
    }
}
