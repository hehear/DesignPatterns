package com.dy.design.patterns.behavioral.observer;

/**
 * @description 具体观察者
 * @author dxy
 * @date 20200312
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject, String name) {
        this.setName(name);
        this.setConcreteSubject(concreteSubject);
    }

    /**
     * 更新观察者状态
     */
    @Override
    public void update() {
        this.setObserverState(concreteSubject.getSubjectState());
        System.out.println("观察者" + this.getName() + "的新状态是"
                + this.getObserverState());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObserverState() {
        return observerState;
    }

    public void setObserverState(String observerState) {
        this.observerState = observerState;
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

}
