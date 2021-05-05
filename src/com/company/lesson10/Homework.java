package com.company.lesson10;

import java.util.HashMap;
import java.util.Map;

public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Coffee", "Potato", "Alpha",
                "Cheese", "Beta", "Humster",
                "Dog", "Cat", "Java",
                "Yava", "Kent", "Coffee",
                "Dog", "Beta", "Humster",
                "Cat", "Java", "Yava", "Dog"
        };

        for (String word : words) {
            if (hm.containsKey(word))
                hm.put(word, hm.get(word) + 1);
            else
                hm.put(word, 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("ivanov", "8999123321");
        directory.add("ivanov", "8912155326");
        directory.add("bobrov", "8917155552");
        directory.add("bobrov", "8913455672");
        directory.add("ivanov", "899999999");
        directory.add("igoryan", "899111111");
        directory.add("bobrov", "89923231999");
        directory.add("smetanov", "8888123113");
        directory.add("igoryan", "8324325234");

        System.out.println(directory.get("ivanov"));
        System.out.println(directory.get("igoryan"));
        System.out.println(directory.get("bobrov"));
        System.out.println(directory.get("smetanov"));
    }
}
