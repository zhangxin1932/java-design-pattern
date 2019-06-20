package com.zy.designPattern.mediator;

import java.util.Optional;

public class WechatPlatform extends Mediator {
    @Override
    void sendMsg2All(String msg) {
        for (User user : list) {
            user.receiveMsg(msg);
        }
    }

    @Override
    void sendMsg2Person(String msg, String name) {
        for (User user : list) {
            if (user.getName().equals(name)) {
                user.receiveMsg(msg);
            }
        }
    }

    @Override
    void join(User user) {
        list.add(user);
    }

    @Override
    void leave(User user) {
        Optional.ofNullable(user).ifPresent(user1 -> list.remove(user1));
    }

}
