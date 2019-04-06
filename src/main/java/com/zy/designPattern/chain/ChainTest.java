package com.zy.designPattern.chain;

/**
 * 责任链模式
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
