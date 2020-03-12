package com.dy.design.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 主题或抽象通知者
 * @author dxy
 * @date 20200312
 */
public abstract class Subject {
    // 观察者引用集合
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
