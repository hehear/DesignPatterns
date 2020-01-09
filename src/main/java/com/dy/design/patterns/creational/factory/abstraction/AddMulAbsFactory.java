package com.dy.design.patterns.creational.factory.abstraction;

import com.dy.design.patterns.creational.factory.simple.Operation;
import com.dy.design.patterns.creational.factory.simple.OperationAdd;


/**
 * @description 加法乘法工厂
 * @author dxy
 * @date 20200109
 */
public class AddMulAbsFactory implements IAbsFactory {


    @Override
    public IOperationAddSub createOperationAddSub() {

        return new OperationAbsAdd();
    }

    @Override
    public IOperationMulDiv createOperationMulDiv() {

        return new OperationAbsMul();
    }
}
