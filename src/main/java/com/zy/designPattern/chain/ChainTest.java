package com.zy.designPattern.chain;

/**
 * 责任链模式
 * 购买请求决策项目介绍
 * 决策因素：价格
 * 决策级别：一级审核、二级审核、三级审核
 */
public class ChainTest {

    public static void main(String[] args) {
        FirstHandler firstHandler = new FirstHandler("first");
        SecondHandler secondHandler = new SecondHandler("second");
        ThirdHandler thirdHandler = new ThirdHandler("third");

        firstHandler.setHandler(secondHandler);
        secondHandler.setHandler(thirdHandler);

        firstHandler.processRequest(new RequestRole(100, 5));
        firstHandler.processRequest(new RequestRole(100, 15));
        firstHandler.processRequest(new RequestRole(100, 30));
    }

}
