package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 减法类
 * @author dxy
 * @date 20200109
 */
public class OperationSub extends Operation {

    @Override
    public double result() {
	return numberA - numberB;
    }

}