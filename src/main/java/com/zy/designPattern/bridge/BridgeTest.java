package com.zy.designPattern.bridge;

import com.zy.designPattern.bridge.abstracts.TvControl01;
import com.zy.designPattern.bridge.abstracts.TvControl02;
import com.zy.designPattern.bridge.impl.HwControl;

/**
 * 桥接模式
 *
 * 购买请求决策项目介绍
 * 决策因素：价格
 * 决策级别：一级审核、二级审核、三级审核
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
