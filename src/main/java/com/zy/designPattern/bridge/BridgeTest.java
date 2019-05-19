package com.zy.designPattern.bridge;

import com.zy.designPattern.bridge.abstracts.TvControl01;
import com.zy.designPattern.bridge.abstracts.TvControl02;
import com.zy.designPattern.bridge.impl.HwControl;

/**
 * 桥接模式
 * 电视厂商及遥控器生产厂商
 *
 */
public class BridgeTest {

    public static void main(String[] args) {
        TvControl01 hwControl01 = new TvControl01(new HwControl());
        TvControl02 hwControl02 = new TvControl02(new HwControl());

        hwControl01.onOff();
        hwControl01.nextChannel();
        hwControl01.preChannel();
        hwControl01.onOff();

        System.out.println("========");

        hwControl02.onOff();
        hwControl02.nextChannel();
        hwControl02.preChannel();
        hwControl02.backChannel();
        hwControl02.setChannel(10);
        hwControl02.onOff();
    }
}
