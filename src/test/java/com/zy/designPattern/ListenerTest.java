package com.zy.designPattern;

import com.zy.designPattern.listener.version01.EventSource;
import com.zy.designPattern.listener.version01.MouseEvent;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class ListenerTest {

    @Test
    public void fn01() throws InterruptedException {
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                eventTest(new MouseEvent("hello"));
            } else {
                eventTest(new MouseEvent("-->" + i));
            }
            i ++;
            TimeUnit.SECONDS.sleep(1);
        }
    }

    private void eventTest(MouseEvent mouseEvent) {
        EventSource eventSource = new EventSource();
        eventSource.addListener(event -> {
            event.doEvent();
            if (event.getSource().equals("hello")) {
                System.out.println("------true-----");
            } else {
                System.out.println("------false-----");
            }
        });
        /*
         * 传入MouseEvent事件，通知所有的事件监听器
         * 对MouseEvent事件感兴趣的listener将会执行
         */
        eventSource.notifyListenerEvents(mouseEvent);
    }
}
