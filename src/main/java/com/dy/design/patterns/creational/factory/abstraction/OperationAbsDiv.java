package com.dy.design.patterns.creational.factory.abstraction;


/**
 * @description 除法类
 * @author dxy
 * @date 20200109
 */
public class OperationAbsDiv implements IOperationMulDiv {

	@Override
    public double result(double numberA,double numberB) {
	if (numberB == 0) {
	    throw new RuntimeException("除数不可以为0！");
	}
	return numberA / numberB;
    }

}