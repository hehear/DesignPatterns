package com.dy.design.patterns.creational.singleton;

/**
 * @description 创建型设计模式-单例模式-懒汉式不安全
 * 优点：静态变量instance被延迟实例化，没有用到该类，那么就不会被实例化，从而节约资源。
 * 缺点：在多线程的环境下是不安全的，如果多个线程同时进入，会实例化多个对象。
 * @author dxy
 * @date 2019-12-27
 */
public class LazyUnsafeSingleton extends Singleton{

    private static Singleton instance;

    private LazyUnsafeSingleton() {
    }

    /**
     * 延迟获得实例
     * @return
     */
    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
