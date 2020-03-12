package com.dy.design.patterns.structural.adapter;

/**
 * @description 客户所期待的接口
 * @author dxy
 * @date 20200312
 */
public abstract class Target {

    public void request() {
        System.out.println("普通请求！");
    }
}
