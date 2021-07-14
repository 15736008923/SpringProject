package org.lanqiao.Test;

import org.junit.Test;
import org.lanqiao.entity.AllConnectionType;
import org.lanqiao.entity.Course;
import org.lanqiao.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AOPTest {
    public static void Icon(){
    ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    Student student=(Student)context.getBean("student");
    System.out.println(student);
}
public static void TestId(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    Course course = (Course)context.getBean("Course");
    System.out.print(course);
}
public static void All(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    AllConnectionType allConnectionType = (AllConnectionType)context.getBean("AllConnectionType");
    AllConnectionType.speake();
}
    public static void main(String[] args){
//        org.lanqiao.entity.Student student = new org.lanqiao.entity.Student();
//        student.setStuAge(20);
//        student.setStuName("hx");
//        student.setStuNum(15);
//        System.out.print(student);
        Icon();
//        TestId();
//        All();
    }
}
