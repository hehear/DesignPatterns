package com.dy.design.patterns.creational.prototype.shallow;

import java.io.Serializable;

/**
 * @description 简历类
 * @author dxy
 * @date 20200306
 */
public class Resume implements Cloneable, Serializable {

    private static final long serialVersionUID = -4410449301166191440L;

    private String name;
    private String gender;
    private int age;

    // 引用“工作经历”对象，为演示深度拷贝和浅度拷贝而用
    private WorkExperience workExperience;

    public Resume() {
        // 在“简历”类实例化时，同时实例化“工作经历”类
        workExperience = new WorkExperience();
    }

    public void display() {
        System.out.println(this.getName() + " " + this.getGender() + " "
                + this.getAge() + "\n工作经历： "
                + this.getWorkExperience().getWorkDate() + " "
                + this.getWorkExperience().getWorkCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public String getName() {
        return name;
    }

    public Resume setName(String name) {
        this.name = name;

        return this;
    }

    public String getGender() {
        return gender;
    }

    public Resume setGender(String gender) {
        this.gender = gender;

        return this;
    }

    public int getAge() {
        return age;
    }

    public Resume setAge(int age) {
        this.age = age;

        return this;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workDate, String workCompany) {
        workExperience.setWorkDate(workDate);
        workExperience.setWorkCompany(workCompany);
    }
}
