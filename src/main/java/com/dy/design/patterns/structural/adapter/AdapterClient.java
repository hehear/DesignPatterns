package com.dy.design.patterns.structural.adapter;

/**
 * @description 适配器客户端
 * @author dxy
 * @date 20200312
 */
public class AdapterClient {

    public static void main(String[] args) {
        Target target;

        target = new Adapter();
        target.request();
    }
}
