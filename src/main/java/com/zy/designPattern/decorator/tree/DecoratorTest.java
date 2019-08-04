package com.zy.designPattern.decorator.tree;

import org.junit.Test;
public class DecoratorTest {
    @Test
    public void fn01() {
        Tree christmasTree = new ChristmasTree("普通圣诞树");
        christmasTree.operator();

        SockesTree sockesTree = new SockesTree(christmasTree, "放袜子的圣诞树");
        sockesTree.operator();
    }
}
