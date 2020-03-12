package com.dy.design.patterns.structural.proxy;

/**
 * @description 真实实体类
 * @author dxy
 * @date 20200312
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实对象的请求");
    }

}
