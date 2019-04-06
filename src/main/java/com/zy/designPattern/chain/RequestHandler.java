package com.zy.designPattern.chain;

public abstract class RequestHandler {

    RequestHandler handler;
    String name;

    public RequestHandler(String name) {
        this.name = name;
    }

    public abstract void processRequest(RequestRole request);

    public void setHandler(RequestHandler handler) {
        this.handler = handler;
    }

}
