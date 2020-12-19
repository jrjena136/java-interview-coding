package com.demo.clonable;

public class ClonableClass implements Cloneable{

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClonableClass() {
        System.out.println("Default constructor");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
