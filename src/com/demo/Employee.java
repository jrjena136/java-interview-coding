package com.demo;

public class Employee {
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override public int hashCode() {
        return 1;
    }

    @Override public boolean equals(Object obj) {
        return true;
    }
}
