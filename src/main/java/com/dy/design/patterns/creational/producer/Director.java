package com.dy.design.patterns.creational.producer;

/**
 * @description 指挥者类，用来指挥建造过程
 * @author dxy
 * @date 20200306
 */
public class Director {

    /**
     * 指挥者指挥构造整个产品
     * @param builder
     */
    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
