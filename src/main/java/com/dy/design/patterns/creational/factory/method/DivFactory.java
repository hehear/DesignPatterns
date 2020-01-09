package com.dy.design.patterns.creational.factory.method;

import com.dy.design.patterns.creational.factory.simple.Operation;
import com.dy.design.patterns.creational.factory.simple.OperationDiv;

/**
 * @description 除法工厂
 * @author dxy
 * @date 20200109
 */
class DivFactory implements IFactory {

    @Override
    public Operation createOperation() {
	return new OperationDiv();
    }

}
