package com.zy.designPattern.adapter.normal;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
/**
 * 电脑:
 * 使用两相插座
 */
@AllArgsConstructor
@NoArgsConstructor
public class PC implements TwoPhaseSocket {
    private String name;
    @Override
    public void input() {
        playApp();
    }
    public void playApp() {
        System.out.println("运行app ..............");
    }
}
