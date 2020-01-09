package com.dy.design.patterns.creational.factory.method;

import com.dy.design.patterns.creational.factory.simple.Operation;
import com.dy.design.patterns.creational.factory.simple.OperationSub;

/**
 * @description 减法工厂
 * @author dxy
 * @date 20200109
 */
class SubFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationSub();
    }

}
