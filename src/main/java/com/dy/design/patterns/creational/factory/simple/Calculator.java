package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 计算器客户端，调用工厂类获得计算操作实例，完成计算操作
 * @author dxy
 * @date 20200109
 */
public class Calculator {
    public static void main(String[] args) {
	Operation operation;
	char operator;

	operator = '*';
	operation = OperationFactory.createOperation(operator);
	operation.numberA = 1;
	operation.numberB = 2;

	System.out.println(operation.result());
    }
}