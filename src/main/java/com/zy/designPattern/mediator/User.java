package com.zy.designPattern.mediator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 用户抽象类
 */
public abstract class User {

    protected Mediator mediator;
    @Getter
    @Setter
    private String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    // 群发消息
    abstract void sendMsg2All(String msg);

    // 私发消息
    abstract void sendMsg2Person(String msg, String name);

    // 接收消息
    abstract void receiveMsg(String msg);

    // 加入聊天室
    abstract void join();

    // 离开聊天室
    abstract void leave();

}
