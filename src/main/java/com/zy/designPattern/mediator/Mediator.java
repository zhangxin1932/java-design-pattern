package com.zy.designPattern.mediator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 中介者抽象类
 */
public abstract class Mediator {

    // 所有聊天室的用户
    List<User> list = new CopyOnWriteArrayList<>();

    // 群发消息
    abstract void sendMsg2All(String msg);

    // 私发消息
    abstract void sendMsg2Person(String msg, String name);

    // 加入聊天室
    abstract void join(User user);

    // 离开聊天室
    abstract void leave(User user);
}
