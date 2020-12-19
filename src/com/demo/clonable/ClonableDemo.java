package com.demo.clonable;

public class ClonableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonableClass obj1 = new ClonableClass();
        obj1.setName("Jyoti");
        System.out.println(obj1.getName());
        ClonableClass obj2 = (ClonableClass) obj1.clone();
        System.out.println(obj2.getName());
        // modify the name via obj1
        obj1.setName("Ranjan");
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());

    }
}
