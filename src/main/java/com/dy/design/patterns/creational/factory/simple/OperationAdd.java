package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 加法类
 * @author dxy
 * @date 20200109
 */
public class OperationAdd extends Operation {

    @Override
    public double result() {
	return numberA + numberB;
    }

}