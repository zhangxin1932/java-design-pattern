package com.zy.designPattern.decorator.tree;

import lombok.AllArgsConstructor;

/**
 * 装饰器
 */
@AllArgsConstructor
public class Decorator implements Tree {
    protected Tree tree;
    @Override
    public void operator() {
        tree.operator();
    }
}
