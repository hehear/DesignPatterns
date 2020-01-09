package com.dy.design.patterns.creational.factory.method;


import com.dy.design.patterns.creational.factory.simple.Operation;

/**
 * @description 工厂方法客户端
 * @author dxy
 * @date 20200109
 */
public class FactoryClient {
    public static void main(String[] args) {

    	//除法
    	IFactory divFactory = new DivFactory();
		Operation div = divFactory.createOperation();
		div.numberA = 3;
		div.numberB = 4;

		System.out.println(div.result());
    	//加法
    	IFactory addFactory = new AddFactory();
		Operation add = addFactory.createOperation();
		add.numberA = 3;
		add.numberB = 4;

		System.out.println(add.result());
    	//乘法
    	IFactory mulFactory = new MulFactory();
		Operation mul = mulFactory.createOperation();
		mul.numberA = 3;
		mul.numberB = 4;

		System.out.println(mul.result());
    	//减法
    	IFactory subFactory = new DivFactory();
		Operation sub = subFactory.createOperation();
		sub.numberA = 3;
		sub.numberB = 4;

		System.out.println(sub.result());

    }
}