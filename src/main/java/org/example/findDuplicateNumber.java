package org.example;

import java.util.*;

public class findDuplicateNumber {
    static void main(String[] args) {

        String str = "Salesforce Is Important".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();


        for(char ch : str.toCharArray()){

            if (map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }
            else
            {
                map.put(ch, 1);
            }


        }
        for(char ch : map.keySet())
        {
            if(map.get(ch)>1)
            {
                System.out.println(ch +"->"+map.get(ch));
            }
        }
    }
}
