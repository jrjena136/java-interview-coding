package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
    private static List<String> names = new ArrayList<>();
    static {
        names.add("Jyoti");
        names.add("Zimbra");
        names.add("Ranjan");
        names.add("Jena");
        names.add("Synacor");
        names.add("Zimbra-mail");
        names.add("Zimbrq");
    }
    public static void main(String[] args) {
        Map<String, Long> map = names.stream()
                .filter(s->s.startsWith("Z"))
                .collect(Collectors.groupingBy(s ->s, Collectors.counting()));
        System.out.println(map);

    }

}
