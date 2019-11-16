package com.zy.designPattern.proxy.jdk;

public class Programmer implements Person {
    @Override
    public void sleep() {
        System.out.println("The one who is a programmer also should sleep in the night instead of coding.");
    }
}
