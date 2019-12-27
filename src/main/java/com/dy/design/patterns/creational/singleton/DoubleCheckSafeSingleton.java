package com.dy.design.patterns.creational.singleton;

/**
 * @description 创建型设计模式-单例模式-双重校验锁安全
 * 优点：既延迟加载实例，又保证了线程安全
 * 缺点：实现较复杂
 * @author dxy
 * @date 2019-12-27
 */
public class DoubleCheckSafeSingleton extends Singleton{

    private volatile static Singleton instance;

    private DoubleCheckSafeSingleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
