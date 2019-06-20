package com.zy.designPattern.mediator;

public class WechatUser extends User {

    public WechatUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    void sendMsg2All(String msg) {
        mediator.sendMsg2All(msg);
    }

    @Override
    void sendMsg2Person(String msg, String name) {
        mediator.sendMsg2Person(msg, name);
    }

    @Override
    void receiveMsg(String msg) {
        System.out.println(this.getName() + "收到消息--->" + msg);
    }

    @Override
    void join() {
        mediator.join(this);
    }

    @Override
    void leave() {
        mediator.leave(this);
    }
}
