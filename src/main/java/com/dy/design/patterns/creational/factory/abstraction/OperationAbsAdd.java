package com.dy.design.patterns.creational.factory.abstraction;


/**
 * @description 加法类
 * @author dxy
 * @date 20200109
 */
public class OperationAbsAdd  implements IOperationAddSub{


    @Override
    public double result(double numberA,double numberB) {
        return numberA + numberB;
    }

}