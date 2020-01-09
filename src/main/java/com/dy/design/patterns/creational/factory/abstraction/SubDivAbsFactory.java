package com.dy.design.patterns.creational.factory.abstraction;


/**
 * @description 减法除法工厂
 * @author dxy
 * @date 20200109
 */
public class SubDivAbsFactory implements IAbsFactory {


    @Override
    public IOperationAddSub createOperationAddSub() {

        return new OperationAbsSub();
    }

    @Override
    public IOperationMulDiv createOperationMulDiv() {

        return new OperationAbsDiv();
    }
}
