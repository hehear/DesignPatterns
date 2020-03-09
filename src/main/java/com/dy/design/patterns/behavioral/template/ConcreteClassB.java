package com.dy.design.patterns.behavioral.template;

/**
 * @description 具体类B
 * @author dxy
 * @date 20200309
 *
 */
public class ConcreteClassB extends AbstractTemplate {

    @Override
    public void primitiveOperation1() {
	System.out.println("具体类B的方法1实现");
    }

    @Override
    public void primitiveOperation2() {
	System.out.println("具体类B的方法2实现");
    }

}
