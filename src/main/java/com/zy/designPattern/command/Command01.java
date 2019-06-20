package com.zy.designPattern.command;

public class Command01 implements Command {

    private Consumer consumer;

    public Command01(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void execute() {
        this.consumer.fn01();
    }
}
