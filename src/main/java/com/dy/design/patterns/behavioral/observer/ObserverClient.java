package com.dy.design.patterns.behavioral.observer;

/**
 * @description 观察者模式客户端代码
 * @author dxy
 * @date 20200312
 */
public class ObserverClient {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver(concreteSubject, "X"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Y"));
        concreteSubject.attach(new ConcreteObserver(concreteSubject, "Z"));

        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifyObserver();

    }

}
