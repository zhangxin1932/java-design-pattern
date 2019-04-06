package com.zy.designPattern.bridge.impl;

/**
 * 海尔遥控器
 */
public class HaierControl implements Control {
    @Override
    public void on() {
        System.out.println("Haier tv is on");
    }

    @Override
    public void off() {
        System.out.println("Haier tv is off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Haier tv channel is " + channel);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Haier tv volume is " + volume);
    }

}
