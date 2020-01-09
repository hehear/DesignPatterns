package com.dy.design.patterns.creational.factory.method;

import com.dy.design.patterns.creational.factory.simple.Operation;
import com.dy.design.patterns.creational.factory.simple.OperationAdd;


/**
 * @description 加法工厂
 * @author dxy
 * @date 20200109
 */
public class AddFactory implements IFactory {

    @Override
    public Operation createOperation() {
        return new OperationAdd();
    }

}
