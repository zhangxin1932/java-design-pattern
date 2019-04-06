package com.zy.designPattern.flyweight;

public class FlyWeightTest {

    public static void main(String[] args) {
        ChessFlyWeight cfw1 = ChessFlyWeightFactory.getChess("black chess");
        ChessFlyWeight cfw2 = ChessFlyWeightFactory.getChess("black chess");
        System.out.println(cfw1 + "=======" + cfw2);
        cfw1.display(new Coordinate(1, 2));
        cfw2.display(new Coordinate(2, 4));
    }
}
