package com.demo;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ranjan", 25);
        Employee e2 = new Employee("Ashish", 26);
        Employee e3 = new Employee("Rashmi", 27);

        Map<Employee, Integer> map = new HashMap<Employee, Integer>();
        map.put(e1, 1);
        map.put(e2, 2);

        System.out.println(map.get(e1));
        System.out.println(map.get(e3));
    }
}
