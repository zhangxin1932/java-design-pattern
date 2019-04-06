package com.zy.designPattern.chain;

public class FirstHandler extends RequestHandler {

    public FirstHandler(String name) {
        super("FirstHandler-->" + name);
    }

    @Override
    public void processRequest(RequestRole request) {
        if (request.getSum() <= 1000) {
            System.out.println("this request will be handled by " + this.name);
        } else {
            handler.processRequest(request);
        }
    }

}
