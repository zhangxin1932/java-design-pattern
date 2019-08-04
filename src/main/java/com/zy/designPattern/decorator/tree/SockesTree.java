package com.zy.designPattern.decorator.tree;

/**
 * 具体装饰器
 */
public class SockesTree extends Decorator {
    private String name;
    public SockesTree(Tree tree, String name) {
        super(tree);
        this.name = name;
    }
    @Override
    public void operator() {
        super.operator();
        System.out.println(this.name + "装饰着" + tree);
    }
}
