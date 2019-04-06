package com.zy.designPattern.bridge.abstracts;

import com.zy.designPattern.bridge.impl.Control;

/**
 * 遥控器抽象类
 */
public abstract class TvControlAbstract {

    protected Control control;
    protected boolean isOn = false;

    public TvControlAbstract(Control control) {
        this.control = control;
    }

    public void onOff() {
        if (isOn) {
            isOn = false;
            control.off();
        } else {
            isOn = true;
            control.on();
        }
    };
    public abstract void nextChannel();
    public abstract void preChannel();
    public abstract void nextVolume();
    public abstract void preVolume();
}
