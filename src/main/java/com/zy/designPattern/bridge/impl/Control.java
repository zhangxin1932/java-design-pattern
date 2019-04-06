package com.zy.designPattern.bridge.impl;

/**
 * 遥控器接口: 不同厂商的遥控器接口
 */
public interface Control {

    void on();

    void off();

    void setChannel(int channel);

    void setVolume(int volume);
}
