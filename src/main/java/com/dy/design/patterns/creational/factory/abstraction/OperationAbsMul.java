package com.dy.design.patterns.creational.factory.abstraction;


/**
 * @description 乘法类
 * @author dxy
 * @date 20200109
 */
public class OperationAbsMul implements IOperationMulDiv {

    @Override
    public double result(double numberA,double numberB) {
	return numberA * numberB;
    }

}