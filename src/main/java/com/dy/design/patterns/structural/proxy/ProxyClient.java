package com.dy.design.patterns.structural.proxy;

/**
 * @description 代理客户端
 * @author dxy
 * @date 20200312
 */
public class ProxyClient {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }
}
