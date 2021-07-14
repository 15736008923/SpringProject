package org.lanqiao.entity;

public class Course {
    Teacher teacher;
    private String Cname;

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacher=" + teacher +
                ", Cname='" + Cname + '\'' +
                '}';
    }
}
