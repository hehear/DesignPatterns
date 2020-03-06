package com.dy.design.patterns.creational.prototype.deep;

import java.io.IOException;

/**
 * @description 原型模式客户端 演示深度拷贝
 * @author dxy
 * @date 20200306
 */
public class PrototypeClient {


    public static void main(String[] args) throws CloneNotSupportedException,
            ClassNotFoundException, IOException {

        Resume aResume = new Resume();
        aResume.setName("hehear").setGender("男 ").setAge(25);
        aResume.setWorkExperience("2016-2020, ", "XX公司");

        Resume bResume = (Resume) aResume.clone();
        bResume.setWorkExperience("2016-2020, ", "YY公司");

        Resume cResume = (Resume) aResume.clone();
        cResume.setWorkExperience("2016-2020, ", "ZZ公司");

        Resume dResume = (Resume) aResume.deepClone();
        dResume.setWorkExperience("2016-2020, ", "DD公司");

        aResume.display();
        bResume.display();
        cResume.display();
        dResume.display();


    }

}
