package com.dy.design.patterns.creational.factory.method;

import com.dy.design.patterns.creational.factory.simple.Operation;
import com.dy.design.patterns.creational.factory.simple.OperationMul;

/**
 * @description 乘法工厂
 * @author dxy
 * @date 20200109
 */
class MulFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationMul();
    }

}
