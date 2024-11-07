package com.example.user.townshipfinding;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private String Yangon;

    public Person(String name, int age, String yangon) {
        this.name = name;
        this.age = age;
        Yangon = yangon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYangon() {
        return Yangon;
    }

    public void setYangon(String yangon) {
        Yangon = yangon;
    }
}
