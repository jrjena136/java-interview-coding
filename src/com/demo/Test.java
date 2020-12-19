package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test implements Inteface1, Interface2 {
    public static void main(String[] args) {
        Test t = new  Test();
        t.test();
        List<String> x = new ArrayList<String>();
        x.add("x");
        x.add("y");
        x.add("z");
        System.out.println(x.stream().toArray(String[]::new));
    }
    public void test(){
        Interface2.super.method2();
    }

}
