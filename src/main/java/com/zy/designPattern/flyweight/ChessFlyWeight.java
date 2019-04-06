package com.zy.designPattern.flyweight;

import lombok.AllArgsConstructor;

public interface ChessFlyWeight {

    // 获得棋子的颜色
    String getColor();

    // 棋子在棋盘中的坐标
    void display(Coordinate c);
}

@AllArgsConstructor
class ConcreteChess implements ChessFlyWeight {

    private String color;

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色是: " + color);
        System.out.println("棋子坐标是: X:" + c.getX() + ",Y:" + c.getY());
    }
}