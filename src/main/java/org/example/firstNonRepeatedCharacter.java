package org.example;

import java.util.*;

public class firstNonRepeatedCharacter {
     static void main(String[] args) {

        String str = "Salesforce Is Important".toLowerCase();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();


        for (char ch : str.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }


        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First Non Repeating Character is " + ch);
                break;
            }
        }
    }
}
