package com.dy.design.patterns.behavioral.strategy;

/**
 * @description 上下文
 * @author dxy
 * @date 20200312
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 上下文接口
     */
    public void contextInterface() {
        strategy.algorithmInterface();
    }

}