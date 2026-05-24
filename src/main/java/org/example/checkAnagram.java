package org.example;
import java.util.*;

public class checkAnagram {
    public static void main(String[] args) {

        String str = "Earth".toLowerCase();
        String str1 = "Heart".toLowerCase();
        char[] arr = str.toCharArray();
        char[] arr1 = str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        if(Arrays.equals(arr,arr1)){
            System.out.println("This is an Anagram Word");
        }
        else{
            System.out.println("This is not an Anagram Word");
        }
    }
}
