package com.dy.design.patterns.creational.factory.abstraction;


import com.dy.design.patterns.creational.factory.simple.Operation;

/**
 * @description 工厂方法客户端
 * @author dxy
 * @date 20200109
 */
public class AbsFactoryClient {
    public static void main(String[] args) {


    	//加法
    	IAbsFactory addFactory = new AddMulAbsFactory();
		IOperationAddSub add = addFactory.createOperationAddSub();
		double result = add.result(3, 4);

		System.out.println(result);
    	//乘法
    	IAbsFactory mulFactory = new AddMulAbsFactory();
		IOperationMulDiv mul = mulFactory.createOperationMulDiv();
		result = mul.result(3, 4);

		System.out.println(result);
    	//减法
    	IAbsFactory subFactory = new SubDivAbsFactory();
		IOperationAddSub sub = subFactory.createOperationAddSub();
		result = sub.result(3, 4);

		System.out.println(result);

		//除法
		IAbsFactory divFactory = new SubDivAbsFactory();
		IOperationMulDiv div = divFactory.createOperationMulDiv();
		result = add.result(3, 4);

		System.out.println(result);

    }
}