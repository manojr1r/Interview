package org.example.pega;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Pega2 {


    public static void main(String[] args) {
//        charaCount("Selenium automation");
        charaCountLinked("Selenium automation");
    }

    public static void charaCount(String input) {

        input = input.replace(" ", "");

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.forEach((k, v) -> System.out.println(k + " → " + v));
    }

    public static void charaCountLinked(String input) {

        input = input.replace(" ", "");

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print ONLY frequency output
        map.forEach((key, value) -> System.out.println(key + " → " + value));
    }


}
