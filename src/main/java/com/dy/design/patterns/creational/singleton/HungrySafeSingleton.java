package com.dy.design.patterns.creational.singleton;

/**
 * @description 创建型设计模式-单例模式-饿汉式安全
 * 优点：解决了线程安全问题，多线程访问也会获得同一个实例对象
 * 缺点：直接实例化丢失了延迟实例化带来的节约资源的好处。
 * @author dxy
 * @date 2019-12-27
 */
public class HungrySafeSingleton extends Singleton{

    private static Singleton instance = new Singleton();

    private HungrySafeSingleton() {
    }

}
