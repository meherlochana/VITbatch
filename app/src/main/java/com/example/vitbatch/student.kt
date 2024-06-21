package com.example.vitbatch;

/**
 * pojo=plain old java object,VO=value object
 */
public class student {
   String NAME;
   int age;
   String address;
//ctrl+shift+A--shortcut for all shorcuts

    public student(String NAME, int age, String address) {
        this.NAME = NAME;
        this.age = age;
        this.address = address;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
