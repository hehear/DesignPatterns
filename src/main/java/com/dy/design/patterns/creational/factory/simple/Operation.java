package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 操作类抽象类
 * @author dxy
 * @date 20200109
 */
public abstract class Operation {
    public double numberA;
    public double numberB;

    public abstract double result();
}
