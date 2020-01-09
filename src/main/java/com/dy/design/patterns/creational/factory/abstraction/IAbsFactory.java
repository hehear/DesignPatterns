package com.dy.design.patterns.creational.factory.abstraction;


/**
 * @description 抽象工厂接口
 * @author dxy
 * @date 20200109
 */
public interface IAbsFactory {

    IOperationAddSub createOperationAddSub();


    IOperationMulDiv createOperationMulDiv();
}



