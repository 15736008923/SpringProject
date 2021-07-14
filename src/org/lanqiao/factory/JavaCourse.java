package org.lanqiao.factory;

public class JavaCourse implements ICourse {
    @Override
    public void learn() {
        System.out.print("学习Java");
        System.out.print("学习Java?");
    }
}
