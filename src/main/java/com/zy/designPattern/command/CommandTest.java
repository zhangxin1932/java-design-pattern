package com.zy.designPattern.command;

public class CommandTest {

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Consumer consumer = new Consumer();

        Command01 command01 = new Command01(consumer);
        invoker.setCommand(command01);
        invoker.run();

        System.out.println("--------");

        Command02 command02 = new Command02(consumer);
        invoker.setCommand(command02);
        invoker.run();
    }
}
