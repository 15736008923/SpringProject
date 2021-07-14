package org.lanqiao.entity;

import org.lanqiao.factory.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
    private int StuAge;
    private String StuName;
    private int StuNum;

    public Student(int stuAge, String stuName, int stuNum) {
        StuAge = stuAge;
        StuName = stuName;
        StuNum = stuNum;
    }

    public Student() {
    }



    public int getStuAge() {
        return StuAge;
    }

    public void setStuAge(int stuAge) {
        StuAge = stuAge;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

    public int getStuNum() {
        return StuNum;
    }

    public void setStuNum(int stuNum) {
        StuNum = stuNum;
    }
    @Override
    public String toString() {
        return "org.lanqiao.entity.Student{" +
                "StuAge=" + StuAge +
                ", StuName='" + StuName + '\'' +
                ", StuNum=" + StuNum +
                '}';
    }
    public void learn(String name){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ICourse course=(ICourse)context.getBean(name);
        course.learn();
    }
}
