package org.lanqiao.entity;

import org.aopalliance.aop.Advice;

import java.util.*;

public class AllConnectionType implements Advice {
    private List<String> list;
    private String[] array;
    private Set set;
    private Map<String,String> map;
    private Properties proper;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return proper;
    }

    public void setProperties(Properties properties) {
        this.proper = properties;
    }

    @Override
    public String toString() {
        return "AllConnectionType{" +
                "list=" + list +
                ", array=" + Arrays.toString(array) +
                ", set=" + set +
                ", map=" + map +
                ", proper=" + proper +
                '}';
    }

    public static void speake(){
        System.out.println("大傻逼");
    }
}
