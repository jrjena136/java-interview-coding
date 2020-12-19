package com.demo;

import java.io.IOException;

import java.nio.file.Paths;
import java.util.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.file.Files.lines;

public class FileOperationWithJava8 {
    public static void main(String[] args) {
        String fileName = "src/sample.txt";
        FileOperationWithJava8 obj = new FileOperationWithJava8();
        obj.processFile(fileName);
    }

    private void processFile(String fileName) {
        try (Stream<String> lines = lines(Paths.get(fileName))) {
            Map<String, Long> wordMap = lines.flatMap(line -> Arrays.stream(line.trim().split(" ")))
                    .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                    .filter(word -> !word.isEmpty() && word != null)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet().stream()
                    .sorted(Map.Entry.<String, Long> comparingByKey()
                            .thenComparing(Map.Entry.comparingByValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (e1, e2) -> e1, LinkedHashMap::new));
            System.out.println(wordMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
