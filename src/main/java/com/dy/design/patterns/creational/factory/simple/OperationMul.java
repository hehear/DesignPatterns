package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 乘法类
 * @author dxy
 * @date 20200109
 */
public class OperationMul extends Operation {

    @Override
    public double result() {
	return numberA * numberB;
    }

}