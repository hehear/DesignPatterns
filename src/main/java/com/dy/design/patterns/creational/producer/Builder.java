package com.dy.design.patterns.creational.producer;

/**
 * @description 抽象构造类
 * @author dxy
 * @date 20200306
 */
public abstract class Builder {

    /**
     * 构造A部分
     */
    public abstract void buildPartA();

    /**
     * 构造B部分
     */
    public abstract void buildPartB();

    /**
     * 构造整个产品
     * @return
     */
    public abstract Product getBuildResult();
}
