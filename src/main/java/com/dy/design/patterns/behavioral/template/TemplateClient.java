package com.dy.design.patterns.behavioral.template;

/**
 * @description 模板方法调用客户端
 * @author dxy
 * @date 20200309
 */
public class TemplateClient {

    public static void main(String[] args) {

        AbstractTemplate abstractTemplateA = new ConcreteClassA();
        // 调用模板方法
        abstractTemplateA.templateMethod();

        AbstractTemplate abstractTemplateB = new ConcreteClassB();
        // 调用模板方法
        abstractTemplateB.templateMethod();

    }
}
