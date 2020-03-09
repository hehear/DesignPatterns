package com.dy.design.patterns.behavioral.template;

/**
 * @description 模板方法抽象类：不变的部分给出具体实现，变化的部分封装为抽象方法延迟到子类实现
 * @author dxy
 * @date 20200309
 */
public abstract class AbstractTemplate {

    /**
     * 抽象子类，放在子类中去实现
     */
    public abstract void primitiveOperation1();

    /**
     * 抽象子类，放在子类中去实现
     */
    public abstract void primitiveOperation2();

    /**
     * 模板方法，给出逻辑的骨架，而逻辑的组成是一些相应的抽象操作，
     * 他们都推迟到子类实现
     */
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法结束\n");
    }

}
