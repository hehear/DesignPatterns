package com.dy.design.patterns.behavioral.observer;

/**
 * @description 具体主题或通知者
 * @author dxy
 * @date 20200312
 */
public class ConcreteSubject extends Subject {
    //状态
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
