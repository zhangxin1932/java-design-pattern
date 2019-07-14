package com.zy.designPattern.adapter.normal;

public class AdapterTest {
    public static void main(String[] args) {
        // 目标接口（三相插座）
        ThreePhaseSocket threePhaseSocket;
        // 冰箱 ---> 使用三相插座
        System.out.println("------------");
        Refrigerator refrigerator = new Refrigerator();
        threePhaseSocket = refrigerator;
        threePhaseSocket.input();
        System.out.println("------------");
        // PC ----> 使用三相适配器
        PC pc = new PC();
        ThreePhaseAdapter adapter = new ThreePhaseAdapter(pc);
        threePhaseSocket = adapter;
        threePhaseSocket.input();
    }
}
