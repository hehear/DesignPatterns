package com.dy.design.patterns.creational.singleton;

/**
 * @description 创建型设计模式-单例模式-静态内部类
 * @author dxy
 * @date 2019-12-27
 */
public class StaticInnerClassSingleton extends Singleton{

    private StaticInnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
