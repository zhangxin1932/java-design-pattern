package com.zy.designPattern.adapter.interfacePattern;

public class AdapterDemo {

    public static void main(String[] args) {
        PowerAdapter adapter = new Power5VAdapter(new AC220());
        System.out.println(adapter.output5V());
    }
}
