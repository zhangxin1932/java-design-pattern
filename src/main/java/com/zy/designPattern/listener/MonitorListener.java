package com.zy.designPattern.listener;

import java.util.EventListener;

/**
 * <pre>https://blog.csdn.net/qq_32252957/article/details/82763848</pre>
 * <pre>https://www.cnblogs.com/jackson-zhangjiang/p/7784694.html</pre>
 *
 * 所有(未必)事件监听器接口都要继承EventListener这个标签接口
 */
public interface MonitorListener extends EventListener {
    void handleEvent(MouseEvent event);
}
