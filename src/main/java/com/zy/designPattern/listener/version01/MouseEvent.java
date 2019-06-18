package com.zy.designPattern.listener.version01;

import java.util.EventObject;

//事件对象
public class MouseEvent extends EventObject {


    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MouseEvent(Object source) {
        super(source);
    }

    public void doEvent() {
        System.out.println(">>> 鼠标事件源 >>>>" + this.getSource());
    }
}
