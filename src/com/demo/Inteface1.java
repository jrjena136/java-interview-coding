package com.demo;

public interface Inteface1 {
    default void method1(){
        System.out.println("Interface1");
    }

    public static void main(String []args) {
        System.out.println("Hello");
    }
}
