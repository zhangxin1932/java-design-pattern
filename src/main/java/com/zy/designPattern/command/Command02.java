package com.zy.designPattern.command;

public class Command02 implements Command {

    private Consumer consumer;

    public Command02(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void execute() {
        this.consumer.fn02();
    }

}
