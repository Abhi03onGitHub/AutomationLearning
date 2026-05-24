package org.example;

public class palindromeString {

         static void main(String[] args){
            String str = "MADAM";
            String str1 = "SIR";
            String reversed = "";
            String reversed1 = "";

            for (int i=str.length()-1;i>=0;i--){
                reversed = reversed + str.charAt(i);
            }
             for (int j=str1.length()-1;j>=0;j--){
                 reversed1 = reversed1 + str1.charAt(j);
             }
             System.out.println("1st Input String = "+str);
            if(str.equals(reversed)){
                System.out.println("This is a Palindrome");
            }
            else{
                System.out.println("This is not a Palindrome");
            }
            System.out.println("2nd Input String = "+str1);
             if(str1.equals(reversed1)){
                 System.out.println("This is a Palindrome");
             }
             else{
                 System.out.println("This is not a Palindrome");
             }

         }
    }


