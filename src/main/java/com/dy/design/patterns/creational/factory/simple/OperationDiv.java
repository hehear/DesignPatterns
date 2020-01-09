package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 除法类
 * @author dxy
 * @date 20200109
 */
public class OperationDiv extends Operation {

    @Override
    public double result() {
	if (numberB == 0) {
	    throw new RuntimeException("除数不可以为0！");
	}
	return numberA / numberB;
    }

}