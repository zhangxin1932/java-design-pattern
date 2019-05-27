package com.zy.designPattern.builer.beanBuilder;

public class BeanBuilder {

    private Integer id;
    private String name;
    private double score;

    public BeanBuilder() {
    }

    public BeanBuilder(Integer id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public BeanBuilder id(Integer id) {
        this.id = id;
        return this;
    }

    public BeanBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BeanBuilder score(double score) {
        this.score = score;
        return this;
    }

    public BeanBuilder build() {
        return new BeanBuilder(this.id, this.name, this.score);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("[")
                .append("id=")
                .append(this.id)
                .append(",")
                .append("name=")
                .append(this.name)
                .append(",")
                .append("score=")
                .append(this.score)
                .append("]").toString();
    }
}
