package com.zy.designPattern.bridge.impl;

/**
 * 华为遥控器实现类
 */
public class HwControl implements Control {
    @Override
    public void on() {
        System.out.println("Hw tv is on");
    }

    @Override
    public void off() {
        System.out.println("Hw tv is off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Hw tv channel is " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Hw tv volume is " + volume);
    }

}
