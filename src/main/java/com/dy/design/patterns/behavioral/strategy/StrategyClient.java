package com.dy.design.patterns.behavioral.strategy;

/**
 * @description 客户端使用策略
 * @author dxy
 * @date 20200312
 */
public class StrategyClient {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();

    }
}
