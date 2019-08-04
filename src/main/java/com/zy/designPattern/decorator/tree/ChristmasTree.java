package com.zy.designPattern.decorator.tree;

import lombok.AllArgsConstructor;

/**
 * 普通圣诞树
 */
@AllArgsConstructor
public class ChristmasTree implements Tree {
    private String name;
    @Override
    public void operator() {
        System.out.println(this.name + "普通圣诞树");
    }
}
