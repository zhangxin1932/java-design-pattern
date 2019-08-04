package com.zy.designPattern.chain.demo01;

public class SecondHandler extends RequestHandler {

    public SecondHandler(String name) {
        super("SecondHandler-->" + name);
    }

    @Override
    public void processRequest(RequestRole request) {
        if (request.getSum() > 1000 && request.getSum() <= 2000) {
            System.out.println("this request will be handled by " + this.name);
        } else {
            handler.processRequest(request);
        }
    }

}
