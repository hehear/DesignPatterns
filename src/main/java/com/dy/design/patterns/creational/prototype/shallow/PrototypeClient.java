package com.dy.design.patterns.creational.prototype.shallow;

import java.io.IOException;

/**
 * @description 原型模式客户端 演示浅度拷贝
 * @author dxy
 * @date 20200306
 */
public class PrototypeClient {



    public static void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume();
        a.setName("hehear").setGender("男 ").setAge(25);
        a.setWorkExperience("2016-2020, ", "XX公司");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2016-2020, ", "YY公司");

        Resume c = (Resume) a.clone();
        c.setWorkExperience("2016-2020, ", "ZZ公司");

        System.out.println("**********浅度拷贝:");
        a.display();
        b.display();
        c.display();

    }

}
