package com.zy.designPattern.mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Mediator wechatPlatform = new WechatPlatform();
        WechatUser user01 = new WechatUser(wechatPlatform, "user01");
        WechatUser user02 = new WechatUser(wechatPlatform, "user02");
        WechatUser user03 = new WechatUser(wechatPlatform, "user03");
        user01.join();
        user02.join();
        user03.join();
        System.out.println("user01-->群发消息---------------");
        user01.sendMsg2All("hello, i am user01");
        System.out.println("user01给user02私发消息-------------");
        user01.sendMsg2Person("你好么, user02", user02.getName());
        System.out.println("user01离开聊天室---------------");
        user01.leave();
    }
}
