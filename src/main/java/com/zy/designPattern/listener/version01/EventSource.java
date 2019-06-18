package com.zy.designPattern.listener.version01;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/*
 事件源
 事件源是是事件对象的入口，包含监听器的注册、撤销、通知
 */
public class EventSource {
    //监听器列表，如果监听事件源的事件，注册监听器可以加入此列表
    private Set<MonitorListener> listeners = new CopyOnWriteArraySet<>();

    // 注册监听器
    public void addListener(MonitorListener listener) {
        listeners.add(listener);
    }

    // 删除监听器
    public void removeListener(MonitorListener listener) {
        listeners.remove(listener);
    }

    // 接收外部事件, 通知所有监听器
    public void notifyListenerEvents(MouseEvent event) {
        listeners.forEach(listener -> listener.handleEvent(event));
    }

}
