package com.dy.design.patterns.creational.producer;

/**
 * @description 建造客户端
 * @author dxy
 * @date 20200306
 */
public class BuilderClient {

    public static void main(String[] args) {

        //指挥者
        Director director = new Director();
        //建造者1
        Builder builder1 = new ConcreteBuilder1();
        //建造者2
        Builder builder2 = new ConcreteBuilder2();

        //指挥建造者1建造产品
        director.construct(builder1);
        //获得建造结果
        Product product1 = builder1.getBuildResult();
        product1.show();

        //指挥建造者2建造产品
        director.construct(builder2);
        //获得建造结果
        Product product2 = builder2.getBuildResult();
        product2.show();

    }

}
