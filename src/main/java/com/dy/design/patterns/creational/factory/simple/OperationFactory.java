package com.dy.design.patterns.creational.factory.simple;

/**
 * @description 操作类工厂类
 * @author dxy
 * @date 20200109
 */
public class OperationFactory {
    public static Operation createOperation(char operator) {
	Operation operation = null;

	switch (operator) {
	case '+':
	    operation = new OperationAdd();
	    break;
	case '-':
	    operation = new OperationSub();
	    break;
	case '*':
	    operation = new OperationMul();
	    break;
	case '/':
	    operation = new OperationDiv();
	    break;
	default:
	    throw new RuntimeException("unsupported operation");
	}

	return operation;
    }
}