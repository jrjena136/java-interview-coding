package com.demo.designpattern;

public class SingletonDesignPattern {
    private static final SingletonDesignPattern INSTANCE = new SingletonDesignPattern();
    private SingletonDesignPattern () {}

    public static SingletonDesignPattern getInstance() {
        return INSTANCE;
    }
}
