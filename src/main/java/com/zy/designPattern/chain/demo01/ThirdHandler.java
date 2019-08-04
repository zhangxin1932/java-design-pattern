package com.zy.designPattern.chain.demo01;

public class ThirdHandler extends RequestHandler {

    public ThirdHandler(String name) {
        super("ThirdHandler-->" + name);
    }

    @Override
    public void processRequest(RequestRole request) {
        if (request.getSum() > 2000) {
            System.out.println("this request will be handled by " + this.name);
        } else {
            handler.processRequest(request);
        }
    }
}
