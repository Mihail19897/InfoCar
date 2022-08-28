package com.company.entities;

public class Person {
    private String name;
    private int age;
    private String gender;
    private int phone;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public long getPhone() {
        return phone;
    }

    public Person(String name, int age, String gender, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
    }
}
