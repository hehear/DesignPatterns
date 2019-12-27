package com.dy.design.patterns.creational.singleton;

/**
 * @description 创建型设计模式-单例模式-懒汉式安全
 * 优点：对getInstance()方法加锁，那么同一时间就只能有一个线程能够进入该方法，从而避免了多次实例化。
 * 缺点：多线程情况下，当一个线程进入该方法后，其他试图进入该方法的线程都必须等待，即使instance已经被实例化了。这会让线程阻塞时间过长出现性能问题。不推荐使用。
 * @author dxy
 * @date 2019-12-27
 */
public class LazySafeSingleton extends Singleton{

    private static Singleton instance;

    private LazySafeSingleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
